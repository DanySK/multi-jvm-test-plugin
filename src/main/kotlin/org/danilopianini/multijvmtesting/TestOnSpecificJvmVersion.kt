package org.danilopianini.multijvmtesting

import org.gradle.api.file.FileCollection
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.testing.Test
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.gradle.jvm.toolchain.JavaToolchainService
import org.gradle.kotlin.dsl.getByType
import javax.inject.Inject

/**
 * A special [Test] task configured to run the tests using a specific [jvmVersion].
 */
abstract class TestOnSpecificJvmVersion
@Inject
constructor(@Internal val jvmVersion: Int) : Test() {
    init {
        group = TASK_GROUP
        description = makeTaskDescription(jvmVersion)
        val launcher =
            project
                .provider { project.extensions.getByType<JavaToolchainService>() }
                .flatMap { toolchains ->
                    val launcher =
                        toolchains.launcherFor {
                            it.languageVersion.set(JavaLanguageVersion.of(jvmVersion))
                        }
                    runCatching { launcher.isPresent }
                        .onFailure {
                            enabled = false
                            project.logger.warn(
                                "Although declared as supported in the multiJvm configuration, " +
                                    "no Java {} distribution is available for the current operating system. " +
                                    "task {} will be disabled.",
                                jvmVersion,
                                name,
                            )
                        }
                    launcher
                }
        javaLauncher.set(launcher)
    }

    override fun getTestClassesDirs(): FileCollection = super.getTestClassesDirs()
        ?: project.layout.buildDirectory
            .dir("classes/kotlin/jvm/test")
            .get()
            .asFileTree

    internal companion object {
        internal const val TASK_GROUP = "Verification"

        internal fun makeTaskDescription(version: Int) =
            "Runs the unit tests using a Java Virtual Machine (JVM) version $version."
    }
}
