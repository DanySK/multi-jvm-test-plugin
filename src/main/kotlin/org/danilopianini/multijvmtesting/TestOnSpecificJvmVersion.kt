package org.danilopianini.multijvmtesting

import org.gradle.api.tasks.testing.Test
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.gradle.jvm.toolchain.JavaToolchainService
import org.gradle.kotlin.dsl.getByType
import javax.inject.Inject

/**
 * A special [Test] task configured to run the tests using a specific JVM Version.
 */
open class TestOnSpecificJvmVersion @Inject constructor(jvmVersion: Int) : Test() {
    init {
        group = TASK_GROUP
        description = makeTaskDescription(jvmVersion)
        val javaToolchains = project.extensions.getByType(JavaToolchainService::class)
        javaLauncher.set(
            javaToolchains.launcherFor {
                it.languageVersion.set(JavaLanguageVersion.of(jvmVersion))
            }
        )
    }

    companion object {

        internal const val TASK_GROUP = "Verification"

        internal fun makeTaskDescription(version: Int) =
            "Runs the unit tests using a Java Virtual Machine (JVM) version $version."
    }
}
