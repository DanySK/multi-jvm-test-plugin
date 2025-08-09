package org.danilopianini.multijvmtesting

import javax.inject.Inject
import org.gradle.api.file.FileCollection
import org.gradle.api.internal.tasks.testing.TestFramework
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.compile.JavaCompile
import org.gradle.api.tasks.testing.Test
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.gradle.jvm.toolchain.JavaToolchainService
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

/**
 * A special [Test] task configured to run the [referenceTest] using a specific [jvmVersion].
 */
abstract class TestOnSpecificJvmVersion
@Inject
constructor(
    @Internal val jvmVersion: Int,
    @Internal val referenceTest: Test,
) : Test() {

    init {
        group = TASK_GROUP
        description = makeTaskDescription(jvmVersion)
        val launcher = project
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
        dependsOn(project.tasks.withType<KotlinCompilationTask<*>>())
        dependsOn(project.tasks.withType<JavaCompile>())
    }

    override fun getClasspath(): FileCollection = referenceTest.classpath

    override fun getTestClassesDirs(): FileCollection = referenceTest.testClassesDirs

    override fun getTestFramework(): TestFramework = referenceTest.testFramework

    override fun getTestFrameworkProperty(): Property<TestFramework> = referenceTest.testFrameworkProperty

    override fun isScanForTestClasses(): Boolean = referenceTest.isScanForTestClasses

    internal companion object {
        internal const val TASK_GROUP = "Verification"

        internal fun makeTaskDescription(version: Int) =
            "Runs the unit tests using a Java Virtual Machine (JVM) version $version."
    }
}
