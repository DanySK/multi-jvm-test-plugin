package org.danilopianini.multijvmtesting

import java.io.Serializable
import org.danilopianini.multijvmtesting.scraper.GRADLE_TABLE_URL
import org.danilopianini.multijvmtesting.scraper.javaRangeForGradle
import org.danilopianini.multijvmtesting.scraper.javaToGradleStatically
import org.danilopianini.multijvmtesting.scraper.scrapeGradleJavaCompatibilityTable
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.property
import org.gradle.kotlin.dsl.setProperty

/**
 * Extension for the [MultiJVMTestingPlugin].
 */
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
    val supportedJvmVersions: Provider<Set<Int>> =
        objects.setProperty<Int>().map {
            (jvmVersionForCompilation.get()..maximumSupportedJvmVersion.get()).toSet() - excluded
        }

    /**
     * The set of all Long-Term Support JVM versions supported by this project.
     */
    val supportedLtsVersions: Provider<Set<Int>> =
        supportedJvmVersions.map { versions ->
            versions.filter { it.isLTS }.toSet()
        }

    /**
     * Union of [supportedLtsVersions] and [maximumSupportedJvmVersion].
     */
    val supportedLtsVersionsAndLatest: Provider<Set<Int>> =
        supportedLtsVersions.map {
            it + maximumSupportedJvmVersion.get()
        }

    /**
     * Shortcut for accessing [Companion.latestJava] in the DSL.
     */
    val latestJava: Int = Companion.latestJava

    /**
     * Shortcut for accessing [Companion.latestJava] in the DSL.
     */
    val latestLts: Int = (OLDEST_LTS..Companion.latestJava).last { it.isLTS }

    /**
     * Shortcut for accessing [Companion.OLDEST_LTS] in the DSL.
     */
    val oldestSupportedJava: Int = OLDEST_LTS

    /**
     * Shortcut for accessing [Companion.latestJavaSupportedByGradle] in the DSL.
     */
    val oldestJavaSupportedByGradle: Int = Companion.javaVersionsSupportedByGradle.first

    /**
     * Shortcut for accessing [Companion.latestJavaSupportedByGradle] in the DSL.
     */
    val latestJavaSupportedByGradle: Int = Companion.javaVersionsSupportedByGradle.last

    /**
     * All known Long Term Support JVM versions.
     */
    val allLtsVersions: Set<Int> = (OLDEST_LTS..latestJava).filter { it.isLTS }.toSet()

    /**
     * Allows to set the JVM versions on which tests should run by default (namely, when calling check).
     * Defaults to [supportedLtsVersionsAndLatest].
     * Honors any [excluded] version.
     */
    var jvmVersionsTestedByDefault: Provider<Set<Int>> = supportedLtsVersionsAndLatest
        get() = field.map { it - excluded }
        private set

    init {
        jvmVersionForCompilation.set(DEFAULT_COMPLIANCE_LEVEL)
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

    /**
     * Support constants.
     */
    companion object {
        private const val serialVersionUID = 1L
        private const val JAVA_VERSION_PATH = "org/danilopianini/multijvmtesting/.java-version"
        private const val OLDEST_LTS = 8

        /**
         * By default, the compiler targets Java 8.
         */
        const val DEFAULT_COMPLIANCE_LEVEL: Int = OLDEST_LTS

        /**
         * The latest known Java version.
         */
        val latestJava =
            checkNotNull(Thread.currentThread().contextClassLoader.getResource(JAVA_VERSION_PATH)) {
                "There must be a bug in the multi-jvm-test-plugin. Please open an issue at " +
                    "https://github.com/DanySK/multi-jvm-test-plugin/issues/new/choose"
            }.readText().trim().substringBefore('.').toInt()

        /**
         * Tries to fetch the newest version of the JVM supported by the current version of gradle.
         * Refers to https://docs.gradle.org/current/userguide/compatibility.html,
         * issues to accessing the website make the value potentially wrong.
         */
        val javaVersionsSupportedByGradle: IntRange by lazy {
            scrapeGradleJavaCompatibilityTable().map { it.javaRangeForGradle() }.getOrElse { error ->
                javaToGradleStatically.javaRangeForGradle().apply {
                    println(
                        """
                        WARNING! No access to: ${GRADLE_TABLE_URL}. The system is offline, or the page format has changed.
                        If you are online, please report this issue at: https://github.com/DanySK/multi-jvm-test-plugin/issues/new/choose
                        Guessing Gradle compatibility level to be between Java $first and $last, error: $error
                        """.trimIndent(),
                    )
                }
            }
        }

        /**
         * Returns true if a JVM version (represented as [Int]) is Long Term Support.
         */
        val Int.isLTS: Boolean get() = this == OLDEST_LTS || this == 11 || this >= 17 && (this - 17) % 4 == 0
    }
}
