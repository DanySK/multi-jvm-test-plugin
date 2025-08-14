package org.danilopianini.multijvmtesting.scraper

import com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
import com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser
import java.net.URI
import org.danilopianini.multijvmtesting.GradleRange

internal const val GRADLE_TABLE_URL = "https://docs.gradle.org/current/userguide/compatibility.html"

/**
 * A map between Java and Gradle versions, scraped from the Gradle compatibility table.
 * The data is fetched from the official Gradle documentation page.
 */
fun scrapeGradleJavaCompatibilityTable(): Result<Map<Int, GradleRange>> = runCatching {
    val stateMachine = ScraperStateMachine()
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
    ksoupHtmlParser.write(URI(GRADLE_TABLE_URL).toURL().readText())
    ksoupHtmlParser.end()
    stateMachine.javaToGradle
}
