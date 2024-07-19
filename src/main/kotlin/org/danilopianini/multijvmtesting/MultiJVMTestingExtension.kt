package org.danilopianini.multijvmtesting

import com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
import com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.property
import org.gradle.kotlin.dsl.setProperty
import org.gradle.util.GradleVersion
import java.io.Serializable
import java.net.URI

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
     * Shortcut for accessing [Companion.oldestLTS] in the DSL.
     */
    val oldestSupportedJava: Int = oldestLTS

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

        private enum class State {
            INIT, TABLE, CAPTION, READY, ROW, JAVA, TOOLCHAINS, GRADLE, END
        }

        /**
         * Tries to fetch the newest version of the JVM supported by the current version of gradle.
         * Refers to https://docs.gradle.org/current/userguide/compatibility.html,
         * issues to accessing the website make the value potentially wrong.
         */
        val latestJavaSupportedByGradle: Int by lazy {
            runCatching {
                val html = URI(gradleTableURL).toURL().readText()
                class StateMachine {
                    var state: State = State.INIT
                    var curJava: Int? = null
                    var javaToGradle: Map<Int, GradleVersion> = emptyMap()
                        private set

                    fun table() {
                        when (state) {
                            State.INIT -> state = State.TABLE
                            else -> Unit
                        }
                    }

                    fun caption() {
                        when (state) {
                            State.TABLE -> state = State.CAPTION
                            else -> Unit
                        }
                    }

                    fun row() {
                        when (state) {
                            State.READY -> state = State.ROW
                            else -> Unit
                        }
                    }

                    fun cell() {
                        when (state) {
                            State.ROW -> state = State.JAVA
                            State.JAVA -> state = State.TOOLCHAINS
                            State.TOOLCHAINS -> state = State.GRADLE
                            State.GRADLE -> state = State.ROW
                            else -> Unit
                        }
                    }

                    fun text(text: String) {
                        when (state) {
                            State.CAPTION -> {
                                if ("Java Compatibility" in text) {
                                    state = State.READY
                                } else {
                                    state = State.INIT
                                }
                            }
                            State.JAVA -> {
                                curJava = text.toInt()
                            }
                            State.GRADLE -> {
                                val java = curJava
                                checkNotNull(java) {
                                    "No value set for Java with Gradle version $text while scraping $gradleTableURL"
                                }
                                if (Regex("""\d+(\.\d)*""").matches(text)) {
                                    javaToGradle += java to GradleVersion.version(text)
                                }
                                state = State.ROW
                            }
                            else -> Unit
                        }
                    }

                    fun endTable() {
                        when (state) {
                            State.INIT, State.END -> Unit
                            State.ROW -> state = State.END
                            else -> error("Unexpected state $state at the end of the table.")
                        }
                    }
                }
                val stateMachine = StateMachine()
                val tableHandler = object : KsoupHtmlHandler {
                    override fun onOpenTagName(name: String) {
                        when (name) {
                            "table" -> stateMachine.table()
                            "caption" -> stateMachine.caption()
                            "tr" -> stateMachine.row()
                            "td" -> stateMachine.cell()
                        }
                    }

                    override fun onCloseTag(name: String, isImplied: Boolean) {
                        when (name) {
                            "table" -> stateMachine.endTable()
                        }
                    }

                    override fun onText(text: String) {
                        if (text.isNotBlank() && text.length < 100) {
                            stateMachine.text(text)
                        }
                    }
                }
                val ksoupHtmlParser = KsoupHtmlParser(handler = tableHandler)
                ksoupHtmlParser.write(html)
                ksoupHtmlParser.end()
                stateMachine.javaToGradle
                    .filterValues { gradleVersion -> GradleVersion.current() >= gradleVersion }
                    .maxByOrNull { (_, gradleVersion) -> gradleVersion }
                    ?.key
                    ?.coerceAtMost(latestJava)
                    ?: latestJava.also {
                        println(
                            "WARNING! $gradleTableURL has unexpected " +
                                "format, the scraping failed. Defaulting to $it, please report this issue at: " +
                                "https://github.com/DanySK/multi-jvm-test-plugin/issues/new/choose",
                        )
                    }
            }.getOrElse { error ->
                latestJava.also {
                    println(
                        "WARNING! No access to: $gradleTableURL " +
                            "guessing Gradle compatibility level to $latestJava, error: $error",
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
