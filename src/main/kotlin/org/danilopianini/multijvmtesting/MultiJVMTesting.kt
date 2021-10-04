package org.danilopianini.multijvmtesting

import org.danilopianini.multijvmtesting.MultiJVMTestingExtension.Companion.isLTS
import org.gradle.api.Plugin
import org.gradle.api.Project
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
import java.io.Serializable
import java.lang.Thread.currentThread
import javax.inject.Inject

open class MultiJVMTesting : Plugin<Project> {
    override fun apply(target: Project) {
        val extension = target.extensions.create<MultiJVMTestingExtension>("multiJvm")
        target.plugins.apply(JavaPlugin::class.java)
        with(target.extensions.getByType(JavaPluginExtension::class)) {
            toolchain {
                it.languageVersion.set(
                    extension.jvmVersionForCompilation.map(JavaLanguageVersion::of)
                )
            }
        }
        target.afterEvaluate {
            val minVersion = extension.jvmVersionForCompilation.get()
            require(minVersion > 0) {
                "The minimum Java version must be positive (set: $minVersion)"
            }
            val maxVersion = extension.maximumSupportedJvmVersion.get()
            require(maxVersion >= minVersion) {
                "The maximum Java version must be equal or higher the compilation version" +
                    "(set: $maxVersion, compilation: $minVersion)"
            }
            val testWithLatestJvm = target.tasks.create("testWithLatestJvm")
            val allTestTasks = (extension.jvmVersionForCompilation.get()..extension.latestJava)
                .map { it to target.tasks.create<TestOnSpecificJvmVersion>("testWithJvm$it", it) }
                .toMap()
            val supportedJvmVersions = extension.supportedJvmVersions.get()
            /*
             * Latest JVM
             */
            testWithLatestJvm.dependsOn(allTestTasks[extension.latestJava])
            val check = target.tasks.named("check").get()
            if (extension.latestJava in supportedJvmVersions) {
                check.dependsOn(testWithLatestJvm)
            }
            /*
             * LTS JVMs
             */
            val testWithLtsJvms = target.tasks.create("testWithLtsJvms")
            val lts = allTestTasks.filterKeys { it.isLTS }
            lts.forEach { (_, task) -> testWithLtsJvms.dependsOn(task) }
            if (supportedJvmVersions.containsAll(lts.keys)) {
                check.dependsOn(testWithLtsJvms)
            }
            /*
             * Latest + LTS
             */
            val testWithLtsAndLatestJvms = target.tasks.create("testWithLtsAndLatestJvms")
            testWithLtsAndLatestJvms.dependsOn(testWithLatestJvm, testWithLtsJvms)
            if (supportedJvmVersions.containsAll(lts.keys + extension.latestJava)) {
                check.dependsOn(testWithLtsAndLatestJvms)
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

    val allLtsVersions: Set<Int> = (8..latestJava).filter { it.isLTS }.toSet()

    var jvmVersionsTestedByDefault: Provider<Set<Int>> = supportedLtsVersionsAndLatest
        get() = field.map { it - excluded }
        private set

    init {
        jvmVersionForCompilation.set(defaultComplianceLevel)
        maximumSupportedJvmVersion.set(latestJava)
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

        val Int.isLTS: Boolean get() = this == 8 || (this - 11) % 6 == 0
    }
}
