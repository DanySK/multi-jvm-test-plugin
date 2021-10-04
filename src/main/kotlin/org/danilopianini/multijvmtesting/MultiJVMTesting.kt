package org.danilopianini.multijvmtesting

import org.danilopianini.multijvmtesting.MultiJVMTestingExtension.Companion.isLTS
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.model.ObjectFactory
import org.gradle.api.plugins.JavaPlugin
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.testing.Test
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.gradle.jvm.toolchain.JavaToolchainService
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.property
import org.gradle.kotlin.dsl.setProperty
import org.gradle.util.GradleVersion
import java.io.Serializable
import java.lang.Thread.currentThread
import java.net.URL
import javax.inject.Inject

open class MultiJVMTesting : Plugin<Project> {
    override fun apply(project: Project) {
        val extension = project.extensions.create<MultiJVMTestingExtension>("multiJvm")
        project.plugins.apply(JavaPlugin::class.java)
        with(project.extensions.getByType(JavaPluginExtension::class)) {
            toolchain {
                it.languageVersion.set(
                    extension.jvmVersionForCompilation.map(JavaLanguageVersion::of)
                )
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

open class TestOnSpecificJvmVersion @Inject constructor(jvmVersion: Int) : Test() {
    init {
        val javaToolchains = project.extensions.getByType(JavaToolchainService::class)
        javaLauncher.set(
            javaToolchains.launcherFor {
                it.languageVersion.set(JavaLanguageVersion.of(jvmVersion))
            }
        )
    }
}

@OptIn(ExperimentalUnsignedTypes::class)
open class MultiJVMTestingExtension(private val objects: ObjectFactory) : Serializable {

    private var excluded: Set<Int> = emptySet()

    val jvmVersionForCompilation: Property<Int> = objects.property()

    val maximumSupportedJvmVersion: Property<Int> = objects.property()

    val supportedJvmVersions: Provider<Set<Int>> = objects.setProperty<Int>().map {
        (jvmVersionForCompilation.get()..maximumSupportedJvmVersion.get()).toSet() - excluded
    }
    val supportedLtsVersions: Provider<Set<Int>> = supportedJvmVersions.map {
        it.filter { it.isLTS }.toSet()
    }
    val supportedLtsVersionsAndLatest: Provider<Set<Int>> = supportedLtsVersions.map {
        it + maximumSupportedJvmVersion.get()
    }

    val latestJava: Int = Companion.latestJava

    val latestJavaSupportedByGradle: Int = Companion.latestJavaSupportedByGradle

    val allLtsVersions: Set<Int> = (8..latestJava).filter { it.isLTS }.toSet()

    var jvmVersionsTestedByDefault: Provider<Set<Int>> = supportedLtsVersionsAndLatest
        get() = field.map { it - excluded }
        private set

    init {
        jvmVersionForCompilation.set(defaultComplianceLevel)
        maximumSupportedJvmVersion.set(latestJava)
        testByDefaultWith(supportedLtsVersionsAndLatest)
    }

    fun testByDefaultWith(vararg jvms: Int) {
        testByDefaultWith(objects.property<Set<Int>>().map { jvms.toSet() })
    }

    fun testByDefaultWith(jvms: Provider<Set<Int>>) {
        jvmVersionsTestedByDefault = jvms
    }

    fun excludeSupportFor(vararg jvms: Int) {
        excluded = excluded + jvms.toSet()
    }

    companion object {
        private const val serialVersionUID = 1L
        private const val DOCKERFILE_PATH = "org/danilopianini/multijvmtesting/Dockerfile"
        const val defaultComplianceLevel: Int = 8

        /**
         * The latest known Java version.
         */
        val latestJava = Regex("^FROM\\s+openjdk:(\\d+)$").matchEntire(
            currentThread().contextClassLoader.getResource(DOCKERFILE_PATH)!!.readText().trim()
        )?.groupValues?.get(1)?.toInt()
            ?: throw IllegalStateException("There must be a bug in the multi-jvm-test-plugin")

        val latestJavaSupportedByGradle: Int =
            Regex("""<tr.*>[\s|\n|\r]*<td.*>.*?(\d+).*?<\/td>[\s|\n|\r]*<td.*>.*?(\d+(?:\.\d+)).*?<\/td>""")
                .findAll(URL("https://docs.gradle.org/current/userguide/compatibility.html").readText())
                .map {
                    val (javaVersion, gradleVersion) = it.destructured
                    javaVersion to GradleVersion.version(gradleVersion)
                }
                .filter { (_, gradleVersion) -> GradleVersion.current() >= gradleVersion }
                .maxByOrNull { (_, gradleVersion) -> gradleVersion }
                ?.first
                ?.toInt()
                ?: latestJava.also {
                    println(
                        "WARNING! No access to: https://docs.gradle.org/current/userguide/compatibility.html," +
                            "guessing Gradle compatibility level to $it"
                    )
                }

        val Int.isLTS: Boolean get() = this == 8 || (this - 11) % 6 == 0
    }
}
