package org.danilopianini.multijvmtesting

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
    constructor(
        @Internal val jvmVersion: Int,
    ) : Test() {
        init {
            group = TASK_GROUP
            description = makeTaskDescription(jvmVersion)
            javaLauncher.set(
                project.provider { project.extensions.getByType<JavaToolchainService>() }.flatMap { toolchains ->
                    val launcher =
                        toolchains.launcherFor {
                            it.languageVersion.set(JavaLanguageVersion.of(jvmVersion))
                        }
                    runCatching { launcher.isPresent }
                        .map { launcher }
                        .onFailure {
                            project.logger.warn(
                                "Although declared as supported in the multiJvm configuration, " +
                                    "no Java $jvmVersion distribution is available for the current operating system.",
                            )
                        }.getOrNull()
                },
            )
        }

        internal companion object {
            internal const val TASK_GROUP = "Verification"

            internal fun makeTaskDescription(version: Int) =
                "Runs the unit tests using a Java Virtual Machine (JVM) version $version."
        }
    }
