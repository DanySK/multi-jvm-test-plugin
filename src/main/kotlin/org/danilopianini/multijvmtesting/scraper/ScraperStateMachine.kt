package org.danilopianini.multijvmtesting.scraper

import org.danilopianini.multijvmtesting.GradleRange
import org.danilopianini.multijvmtesting.rangeTo
import org.gradle.util.GradleVersion

internal class ScraperStateMachine {

    private enum class State {
        INIT,
        TABLE,
        CAPTION,
        READY,
        ROW,
        JAVA,
        TOOLCHAINS,
        GRADLE,
        END,
    }

    private var state: State = State.INIT
    private var curJava: Int? = null
    var javaToGradle: Map<Int, GradleRange> = org.danilopianini.multijvmtesting.scraper.javaToGradleStatically
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
                    "No value set for Java with Gradle version $text while scraping $GRADLE_TABLE_URL"
                }
                val match = GRADLE_VERSION_RANGE.find(text)
                if (match != null) {
                    val (start, end) = match.destructured
                    val gradleStart = GradleVersion.version(start)
                    val gradleEnd = end.takeUnless { it.isBlank() }?.let { GradleVersion.version(it) }
                    javaToGradle += java to (gradleStart..gradleEnd)
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

    companion object {
        private val GRADLE_VERSION_RANGE =
            """(\d+(?:\.\d+)+)*(?:\s+to\s+(\d+(?:\.\d+)+)*|\s+and\s+after)""".toRegex()
    }
}
