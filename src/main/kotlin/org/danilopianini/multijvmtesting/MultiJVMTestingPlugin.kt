package org.danilopianini.multijvmtesting

import org.danilopianini.multijvmtesting.MultiJVMTestingExtension.Companion.isLTS
import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPlugin
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.api.tasks.TaskCollection
import org.gradle.api.tasks.TaskProvider
import org.gradle.api.tasks.testing.Test
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.gradle.jvm.toolchain.JavaToolchainService
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.register
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinPlatformJvmPlugin

/**
 * A [Plugin] that configures the build with the ability to test using multiple JVMs.
 */
open class MultiJVMTestingPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val extension = project.extensions.create<MultiJVMTestingExtension>("multiJvm")
        project.plugins.apply(JavaPlugin::class.java)
        val versionForCompilation = extension.jvmVersionForCompilation.map(JavaLanguageVersion::of)
        with(project.extensions.getByType(JavaPluginExtension::class)) {
            toolchain {
                it.languageVersion.set(versionForCompilation)
            }
        }
        project.plugins.withType<KotlinPlatformJvmPlugin> {
            with(project.extensions.getByType(KotlinJvmProjectExtension::class)) {
                jvmToolchain {
                    it.languageVersion.set(versionForCompilation)
                }
            }
        }
        /*
         * Set all pre-existing tests to run with the oldest supported JVM
         */
        val preExistingTests = project.tasks.withType<Test>().toList()
        /*
         * Generate or map all existing tests
         */
        val allTestTasks: Map<Int, TaskProvider<out Test>> = (extension.oldestSupportedJava..extension.latestJava)
            .mapNotNull { version ->
                val javaToolchains = project.extensions.getByType(JavaToolchainService::class)
                val launcher = javaToolchains.launcherFor {
                    it.languageVersion.set(JavaLanguageVersion.of(version))
                }
                runCatching { launcher.isPresent }
                    .onFailure {
                        project.logger.warn(
                            "Although declared as supported in the multiJvm configuration, " +
                                "no Java $version distribution is available for the current operating system.",
                        )
                    }
                    .map { version to launcher }
                    .getOrNull()
            }
            .toMap()
            .mapValues { (version, launcher) ->
                project.tasks.register<TestOnSpecificJvmVersion>("testWithJvm$version", version).apply {
                    configure { testTaskOnSpecificJvmVersion ->
                        if (version == extension.jvmVersionForCompilation.get()) {
                            testTaskOnSpecificJvmVersion.enabled = false
                            testTaskOnSpecificJvmVersion.dependsOn(preExistingTests)
                            preExistingTests.forEach { test ->
                                test.javaLauncher.set(launcher)
                            }
                        }
                    }
                }
            }
        fun Project.testTasksWithJvm(predicate: (Int) -> Boolean): TaskCollection<Test> =
            tasks.withType<Test>().matching {
                predicate(it.javaLauncher.get().metadata.languageVersion.asInt())
            }
        /*
         * Latest JVM
         */
        val testWithLatestJvm = project.tasks.register<DefaultTask>("testWithLatestJvm") {
            dependsOn(project.testTasksWithJvm { it == extension.latestJava })
        }
        /*
         * LTS JVMs
         */
        val testWithLtsJvms = project.tasks.register<DefaultTask>("testWithLtsJvms") {
            dependsOn(project.testTasksWithJvm { it > extension.jvmVersionForCompilation.get() && it.isLTS })
        }
        /*
         * Latest + LTS
         */
        val testWithLtsAndLatestJvms = project.tasks.register<DefaultTask>("testWithLtsAndLatestJvms") {
            dependsOn(testWithLatestJvm, testWithLtsJvms)
        }
        /*
         * Wire the check task
         */
        project.tasks.named("check").configure { checkTask ->
            val supportedJvmVersions = extension.supportedJvmVersions.get()
            val latestIsEnabled = extension.latestJava in supportedJvmVersions
            if (latestIsEnabled) {
                checkTask.dependsOn(testWithLatestJvm)
            }
            val minimumSupportedJava = extension.jvmVersionForCompilation.get()
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
        }
    }
}
