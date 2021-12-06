package org.danilopianini.multijvmtesting

import org.danilopianini.multijvmtesting.MultiJVMTestingExtension.Companion.isLTS
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.plugins.JavaPlugin
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.api.tasks.testing.Test
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.gradle.jvm.toolchain.JavaToolchainService
import org.gradle.jvm.toolchain.JavaToolchainSpec
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.findByType
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

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
        project.extensions.findByType(KotlinJvmProjectExtension::class)?.apply {
            jvmToolchain {
                if (it is JavaToolchainSpec) {
                    it.languageVersion.set(versionForCompilation)
                }
            }
        }
        project.afterEvaluate { _ ->
            val minVersion = extension.jvmVersionForCompilation.get()
            require(minVersion > 0) {
                "The minimum Java version must be positive (set: $minVersion)"
            }
            val maxVersion = extension.maximumSupportedJvmVersion.get()
            require(maxVersion >= minVersion) {
                "The maximum Java version must be equal or higher the compilation version" +
                    "(set: $maxVersion, compilation: $minVersion)"
            }
            val javaToolchains = project.extensions.getByType(JavaToolchainService::class)
            /*
             * If there is only a default test, then use it as reference for the JVM used for compiling code.
             * Otherwise, generate a corresponding task.
             */
            val testTasks = project.tasks.withType(Test::class.java).toList()
            val baseTestTask = if (testTasks.size == 1) testTasks.first() else null
            baseTestTask?.run {
                javaLauncher.set(
                    javaToolchains.launcherFor {
                        it.languageVersion.set(JavaLanguageVersion.of(extension.jvmVersionForCompilation.get()))
                    }
                )
            }
            val allTestTasks: Map<Int, Task> =
                (extension.jvmVersionForCompilation.get()..extension.latestJava).associateWith { version ->
                    if (version == extension.jvmVersionForCompilation.get() && baseTestTask != null) {
                        project.tasks.create("testWithJvm$version").apply {
                            group = TestOnSpecificJvmVersion.TASK_GROUP
                            description = TestOnSpecificJvmVersion.makeTaskDescription(version)
                            dependsOn(baseTestTask)
                        }
                    } else {
                        project.tasks.create<TestOnSpecificJvmVersion>("testWithJvm$version", version)
                    }
                }
            val supportedJvmVersions = extension.supportedJvmVersions.get()
            /*
             * Latest JVM
             */
            val testWithLatestJvm = project.tasks.create("testWithLatestJvm")
            testWithLatestJvm.dependsOn(allTestTasks[extension.latestJava])
            val check = project.tasks.named("check").get()
            if (extension.latestJava in supportedJvmVersions) {
                check.dependsOn(testWithLatestJvm)
            }
            /*
             * LTS JVMs
             */
            val testWithLtsJvms = project.tasks.create("testWithLtsJvms")
            val lts = allTestTasks.filterKeys { it.isLTS }
            lts.forEach { (_, task) -> testWithLtsJvms.dependsOn(task) }
            if (supportedJvmVersions.containsAll(lts.keys)) {
                check.dependsOn(testWithLtsJvms)
            }
            /*
             * Latest + LTS
             */
            val testWithLtsAndLatestJvms = project.tasks.create("testWithLtsAndLatestJvms")
            testWithLtsAndLatestJvms.dependsOn(testWithLatestJvm, testWithLtsJvms)
            if (supportedJvmVersions.containsAll(lts.keys + extension.latestJava)) {
                check.dependsOn(testWithLtsAndLatestJvms)
            }
            /*
             * Remaining JVMs
             */
            extension.jvmVersionsTestedByDefault.get().forEach { version ->
                check.dependsOn(allTestTasks[version])
            }
        }
    }
}
