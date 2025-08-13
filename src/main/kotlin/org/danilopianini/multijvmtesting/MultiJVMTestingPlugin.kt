package org.danilopianini.multijvmtesting

import org.danilopianini.multijvmtesting.MultiJVMTestingExtension.Companion.isLTS
import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.api.plugins.quality.AbstractCodeQualityTask
import org.gradle.api.tasks.Copy
import org.gradle.api.tasks.TaskCollection
import org.gradle.api.tasks.testing.Test
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.gradle.jvm.toolchain.JavaToolchainService
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.register
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.targets.js.testing.KotlinJsTest
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpack
import org.jetbrains.kotlin.gradle.tasks.IncrementalSyncTask

/**
 * A [Plugin] that configures the build with the ability to test using multiple JVMs.
 */
open class MultiJVMTestingPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val extension = project.extensions.create<MultiJVMTestingExtension>("multiJvm")
        val javaToolchains by lazy { project.extensions.getByType<JavaToolchainService>() }
        /*
         * Meta-tasks
         */
        val testWithLatestJvm = project.tasks.register<DefaultTask>("testWithLatestJvm")
        val testWithLtsJvms = project.tasks.register<DefaultTask>("testWithLtsJvms")
        val testWithLtsAndLatestJvms = project.tasks.register<DefaultTask>("testWithLtsAndLatestJvms") {
            dependsOn(testWithLatestJvm, testWithLtsJvms)
        }
        /*
         * One special task per task
         */
        project.tasks.withType<Test>().matching { it !is TestOnSpecificJvmVersion }.all { test ->
            (extension.oldestSupportedJava..extension.latestJava).associateWith { version ->
                val jvmTest = project.tasks.register<TestOnSpecificJvmVersion>(
                    "${test.name}WithJvm$version",
                    version,
                    test,
                )
                if (version == extension.latestJava) {
                    testWithLatestJvm.configure {
                        it.dependsOn(jvmTest)
                    }
                }
            }
        }

        fun testTasksWithJvm(predicate: (Int) -> Boolean): TaskCollection<TestOnSpecificJvmVersion> =
            project.tasks.withType<TestOnSpecificJvmVersion>().matching { predicate(it.jvmVersion) }
        fun testTasksWithJvm(version: Int): TaskCollection<TestOnSpecificJvmVersion> =
            testTasksWithJvm { it == version }

        testWithLtsJvms.configure { task ->
            task.dependsOn(
                testTasksWithJvm { version -> version >= extension.jvmVersionForCompilation.get() && version.isLTS },
            )
        }
        /*
         * Check task wiring
         */
        val versionForCompilation = extension.jvmVersionForCompilation.map(JavaLanguageVersion::of)
        fun wireTheCheckTask() = project.tasks.named("check").configure { checkTask ->
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
                checkTask.dependsOn(testTasksWithJvm(version))
            }
        }
        /*
         * Configure the JVM version for compilation
         */
        project.pluginManager.withPlugin("java") { _ ->
            project.extensions.getByType<JavaPluginExtension>().toolchain {
                it.languageVersion.set(versionForCompilation)
            }
            wireTheCheckTask()
        }
        project.pluginManager.withPlugin("org.jetbrains.kotlin.jvm") { _ ->
            project.extensions.configure<KotlinJvmProjectExtension> {
                jvmToolchain {
                    it.languageVersion.set(versionForCompilation)
                }
            }
            wireTheCheckTask()
        }
        project.pluginManager.withPlugin("org.jetbrains.kotlin.multiplatform") { _ ->
            project.extensions.configure<KotlinMultiplatformExtension> {
                jvmToolchain {
                    it.languageVersion.set(versionForCompilation)
                }
            }
            wireTheCheckTask()
            /*
             * For unclear reasons, some kotlin js tasks are disrupted by the application of this plugin.
             * Errors look like:
             *
             *  Task ':wasmJsNodeTest' uses this output of task ':wasmJsTestTestProductionExecutableCompileSync'
             * without declaring an explicit or implicit dependency.
             *
             * This looks more like a bug in the Kotlin plugin, and this hack should be removed in the future.
             */
            val allSyncs = project.tasks.withType<IncrementalSyncTask>()
            project.tasks.withType<KotlinJsTest>().configureEach {
                it.dependsOn(allSyncs)
            }
            project.tasks.withType<KotlinWebpack>().configureEach {
                it.dependsOn(allSyncs)
            }
            project.tasks.withType<Copy>()
                .matching { it.name.endsWith("LibraryDistribution") }
                .matching { it.name.startsWith("js") || it.name.startsWith("wasmJs") }
                .configureEach { libraryDistribution -> libraryDistribution.dependsOn(allSyncs) }
        }
        /*
         * Code quality checks
         */
        @Suppress("UnstableApiUsage")
        project.tasks.withType<AbstractCodeQualityTask>().configureEach { qaTask ->
            qaTask.javaLauncher.set(
                javaToolchains.launcherFor {
                    it.languageVersion.set(JavaLanguageVersion.of(extension.jvmVersionForCompilation.get()))
                },
            )
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
                project.logger.info(
                    "Disabling task {} (incompatible with minimum version {}, or superseded by the {} task)",
                    it.name,
                    minVersion,
                    it.referenceTest.name,
                )
            }
        }
    }
}
