package org.danilopianini.multijvmtesting

import org.danilopianini.multijvmtesting.MultiJVMTestingExtension.Companion.isLTS
import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.api.tasks.TaskProvider
import org.gradle.api.tasks.testing.Test
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.gradle.jvm.toolchain.JavaToolchainService
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.register
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

/**
 * A [Plugin] that configures the build with the ability to test using multiple JVMs.
 */
open class MultiJVMTestingPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val extension = project.extensions.create<MultiJVMTestingExtension>("multiJvm")
        /*
         * Generate all tests with a specific JVM
         */
        val javaToolchains by lazy { project.extensions.getByType<JavaToolchainService>() }

        val allTestTasks: Map<Int, TaskProvider<out Test>> =
            (extension.oldestSupportedJava..extension.latestJava).associate { version ->
                version to project.tasks.register<TestOnSpecificJvmVersion>("testWithJvm$version", version)
            }

        fun testTasksWithJvm(predicate: (Int) -> Boolean): Collection<TaskProvider<out Test>> =
            allTestTasks.filterKeys { predicate(it) }.values
        /*
         * Latest JVM
         */
        val testWithLatestJvm =
            project.tasks.register<DefaultTask>("testWithLatestJvm") {
                dependsOn(testTasksWithJvm { it == extension.latestJava })
            }
        /*
         * LTS JVMs
         */
        val testWithLtsJvms =
            project.tasks.register<DefaultTask>("testWithLtsJvms") {
                dependsOn(testTasksWithJvm { it > extension.jvmVersionForCompilation.get() && it.isLTS })
            }
        /*
         * Latest + LTS
         */
        val testWithLtsAndLatestJvms =
            project.tasks.register<DefaultTask>("testWithLtsAndLatestJvms") {
                dependsOn(testWithLatestJvm, testWithLtsJvms)
            }
        val versionForCompilation = extension.jvmVersionForCompilation.map(JavaLanguageVersion::of)

        /*
         * Check task wiring
         */
        fun wireTheCheckTask() =
            project.tasks.named("check").configure { checkTask ->
                val supportedJvmVersions = extension.supportedJvmVersions.get()
                val latestIsEnabled = extension.latestJava in supportedJvmVersions
                if (latestIsEnabled) {
                    checkTask.dependsOn(testWithLatestJvm)
                }
                val minimumSupportedJava = versionForCompilation.get().asInt()
                val allTheLTS = (minimumSupportedJava..extension.latestJava).filter { it.isLTS }
                val ltsAreEnabled = supportedJvmVersions.containsAll(allTheLTS)
                if (ltsAreEnabled) {
                    checkTask.dependsOn(testWithLtsJvms)
                }
                if (ltsAreEnabled && latestIsEnabled) {
                    checkTask.dependsOn(testWithLtsAndLatestJvms)
                }
                extension.jvmVersionsTestedByDefault.get().forEach { version ->
                    checkTask.dependsOn(allTestTasks[version])
                }
            }
        /*
         * Configure the JVM version for compilation
         */
        project.pluginManager.withPlugin("java") { _ ->
            project.extensions.getByType<JavaPluginExtension>().toolchain {
                it.languageVersion.set(versionForCompilation)
            }
            /*
             * Wire the check task
             */
            wireTheCheckTask()
        }
        project.pluginManager.withPlugin("org.jetbrains.kotlin.jvm") {
            println("Configuring Kotlin JVM toolchain")
            project.extensions.configure<KotlinJvmProjectExtension> {
                jvmToolchain {
                    it.languageVersion.set(versionForCompilation)
                }
            }
            wireTheCheckTask()
        }
        /*
         * Consistency check
         */
        project.afterEvaluate { _ ->
            val minVersion = extension.jvmVersionForCompilation.get()
            val maxVersion = extension.maximumSupportedJvmVersion.get()
            require(minVersion > 0) {
                "The minimum Java version must be positive (set: $minVersion)"
            }
            require(maxVersion >= minVersion) {
                "The maximum Java version must be equal or higher the compilation version" +
                    "(set: $maxVersion, compilation: $minVersion)"
            }
            /*
             * Find the task using the JVM used to compile, and disable it in
             * favor of the built-in test task.
             * Contextually, configure the default task to use the JVM used to compile.
             */
            val baseTests = project.tasks.withType<Test>().matching { it !is TestOnSpecificJvmVersion }
            baseTests.forEach { baseTestTask ->
                baseTestTask.javaLauncher.set(
                    javaToolchains.launcherFor {
                        it.languageVersion.set(JavaLanguageVersion.of(minVersion))
                    },
                )
            }
            project.tasks.withType<TestOnSpecificJvmVersion>().matching { it.jvmVersion <= minVersion }.forEach {
                it.enabled = false
                it.dependsOn(baseTests)
                project.logger.info("Disabling task ${it.name} (incompatible or superseded by the built-in test task)")
            }
        }
    }
}
