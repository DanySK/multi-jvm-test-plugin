package org.danilopianini.multijvmtesting

import org.gradle.api.tasks.testing.Test
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.gradle.jvm.toolchain.JavaToolchainService
import org.gradle.kotlin.dsl.getByType
import javax.inject.Inject

/**
 * A special [Test] task configured to run the tests using a specific JVM Version.
 */
abstract class TestOnSpecificJvmVersion @Inject constructor(jvmVersion: Int) : Test() {

    init {
        group = TASK_GROUP
        description = makeTaskDescription(jvmVersion)
        val javaToolchains = project.extensions.getByType(JavaToolchainService::class)
        val launcher = javaToolchains.launcherFor {
            it.languageVersion.set(JavaLanguageVersion.of(jvmVersion))
        }
        javaLauncher.set(launcher)
        val tryResolve = runCatching { launcher.isPresent }
            .onFailure {
                project.logger.warn(
                    "Task $name has been disabled as no $jvmVersion is available for the current system.",
                )
            }
        enabled = tryResolve.getOrDefault(false)
    }

    companion object {

        internal const val TASK_GROUP = "Verification"

        internal fun makeTaskDescription(version: Int) =
            "Runs the unit tests using a Java Virtual Machine (JVM) version $version."
    }
}
