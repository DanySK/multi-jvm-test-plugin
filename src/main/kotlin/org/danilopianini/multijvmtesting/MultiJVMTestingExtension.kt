package org.danilopianini.multijvmtesting

import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.property
import org.gradle.kotlin.dsl.setProperty
import org.gradle.util.GradleVersion
import java.io.Serializable
import java.net.URL

/**
 * Extension for the [MultiJVMTestingPlugin].
 */
@OptIn(ExperimentalUnsignedTypes::class)
open class MultiJVMTestingExtension(private val objects: ObjectFactory) : Serializable {

    private var excluded: Set<Int> = emptySet()

    /**
     * The JVM version that is used as target for compiling the code.
     */
    val jvmVersionForCompilation: Property<Int> = objects.property()

    /**
     * Newest JVM version supported by the project.
     */
    val maximumSupportedJvmVersion: Property<Int> = objects.property()

    /**
     * All the JVM versions supported by the project.
     */
    val supportedJvmVersions: Provider<Set<Int>> = objects.setProperty<Int>().map {
        (jvmVersionForCompilation.get()..maximumSupportedJvmVersion.get()).toSet() - excluded
    }

    /**
     * The set of all Long-Term Support JVM versions supported by this project.
     */
    val supportedLtsVersions: Provider<Set<Int>> = supportedJvmVersions.map { versions ->
        versions.filter { it.isLTS }.toSet()
    }

    /**
     * Union of [supportedLtsVersions] and [maximumSupportedJvmVersion].
     */
    val supportedLtsVersionsAndLatest: Provider<Set<Int>> = supportedLtsVersions.map {
        it + maximumSupportedJvmVersion.get()
    }

    /**
     * Shortcut for accessing [Companion.latestJava] in the DSL.
     */
    val latestJava: Int = Companion.latestJava

    /**
     * Shortcut for accessing [Companion.latestJavaSupportedByGradle] in the DSL.
     */
    val latestJavaSupportedByGradle: Int = Companion.latestJavaSupportedByGradle

    /**
     * All known Long Term Support JVM versions.
     */
    val allLtsVersions: Set<Int> = (oldestLTS..latestJava).filter { it.isLTS }.toSet()

    /**
     * Allows to set the JVM versions on which tests should run by default (namely, when calling check).
     * Defaults to [supportedLtsVersionsAndLatest].
     * Honors any [excluded] version.
     */
    var jvmVersionsTestedByDefault: Provider<Set<Int>> = supportedLtsVersionsAndLatest
        get() = field.map { it - excluded }
        private set

    init {
        jvmVersionForCompilation.set(defaultComplianceLevel)
        maximumSupportedJvmVersion.set(latestJava)
    }

    /**
     * Forcibly tests with the provided [jvms] (unless they are [excluded]).
     */
    fun testByDefaultWith(vararg jvms: Int) {
        testByDefaultWith(objects.setProperty<Int>().map { jvms.toSet() })
    }

    /**
     * Forcibly tests with the provided [jvms] (unless they are [excluded]).
     */
    fun testByDefaultWith(jvms: Provider<Set<Int>>) {
        jvmVersionsTestedByDefault = jvms
    }

    /**
     * Forcibly removes support for the provided [jvms].
     */
    fun excludeSupportFor(vararg jvms: Int) {
        excluded = excluded + jvms.toSet()
    }

    companion object {
        private const val serialVersionUID = 1L
        private const val gradleTableURL = "https://docs.gradle.org/current/userguide/compatibility.html"
        private const val DOCKERFILE_PATH = "org/danilopianini/multijvmtesting/Dockerfile"
        private const val oldestLTS = 8

        /**
         * By default, the compiler targets Java 8.
         */
        const val defaultComplianceLevel: Int = oldestLTS

        /**
         * The latest known Java version.
         */
        val latestJava = checkNotNull(
            Regex("^FROM\\s+eclipse-temurin:(\\d+)$")
                .matchEntire(Thread.currentThread().contextClassLoader.getResource(DOCKERFILE_PATH)!!.readText().trim())
                ?.groupValues
                ?.get(1)
                ?.toInt(),
        ) {
            "There must be a bug in the multi-jvm-test-plugin. Please open an issue at " +
                "https://github.com/DanySK/multi-jvm-test-plugin/issues/new/choose"
        }

        /**
         * Tries to fetch the newest version of the JVM supported by the current version of gradle.
         * Refers to https://docs.gradle.org/current/userguide/compatibility.html,
         * issues to accessing the website make the value potentially wrong.
         */
        val latestJavaSupportedByGradle: Int by lazy {
            runCatching {
                Regex("""<tr.*>[\s\n\r]*<td.*>.*?(\d+).*?</td>[\s\n\r]*<td.*>.*?(\d+\.\d+).*?</td>""")
                    .findAll(URL(gradleTableURL).readText())
                    .map {
                        val (javaVersion, gradleVersion) = it.destructured
                        javaVersion to GradleVersion.version(gradleVersion)
                    }
                    .filter { (_, gradleVersion) -> GradleVersion.current() >= gradleVersion }
                    .maxByOrNull { (_, gradleVersion) -> gradleVersion }
                    ?.first
                    ?.toInt()
                    ?.coerceAtMost(latestJava)
                    ?: latestJava.also {
                        println(
                            "WARNING! $gradleTableURL has unexpected " +
                                "format, the scraping failed. Defaulting to $it, please report this issue at: " +
                                "https://github.com/DanySK/multi-jvm-test-plugin/issues/new/choose",
                        )
                    }
            }.getOrElse {
                latestJava.also { _ ->
                    println(
                        "WARNING! No access to: $gradleTableURL " +
                            "guessing Gradle compatibility level to $latestJava",
                    )
                }
            }
        }

        /**
         * Returns true if a JVM version (represented as [Int]) is Long Term Support.
         */
        val Int.isLTS: Boolean get() = this == oldestLTS || (this - 11) % 6 == 0
    }
}
