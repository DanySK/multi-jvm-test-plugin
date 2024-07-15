package org.danilopianini.multijvmtesting

import org.gradle.api.provider.Property
import org.gradle.api.tasks.testing.Test
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.gradle.jvm.toolchain.JavaToolchainService
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.property
import javax.inject.Inject

/**
 * A special [Test] task configured to run the tests using a specific JVM Version.
 */
open class TestOnSpecificJvmVersion @Inject constructor(jvmVersion: Int) : Test() {

    private lateinit var isADryRun: Property<Boolean>

    init {
        group = TASK_GROUP
        description = makeTaskDescription(jvmVersion)
        val javaToolchains = project.extensions.getByType(JavaToolchainService::class)
        javaLauncher.set(
            javaToolchains.launcherFor {
                it.languageVersion.set(JavaLanguageVersion.of(jvmVersion))
            },
        )
    }

    companion object {

        internal const val TASK_GROUP = "Verification"

        internal fun makeTaskDescription(version: Int) =
            "Runs the unit tests using a Java Virtual Machine (JVM) version $version."
    }

    @Suppress("UnstableApiUsage")
    override fun getDryRun(): Property<Boolean> = when {
        ::isADryRun.isInitialized -> isADryRun
        else -> {
            isADryRun = project.objects.property<Boolean>()
            isADryRun
        }
    }
}
