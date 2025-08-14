package org.danilopianini.multijvmtesting.scraper

import org.danilopianini.multijvmtesting.GradleRange
import org.danilopianini.multijvmtesting.MultiJVMTestingExtension.Companion.latestJava
import org.danilopianini.multijvmtesting.rangeTo
import org.gradle.util.GradleVersion

private const val OLDEST_SUPPORTED_BY_GRADLE = 17

private val gradle8X = gradle("8.14.${Short.MAX_VALUE}")
private val futureGradle = gradle("${Short.MAX_VALUE}.${Short.MAX_VALUE}.${Short.MAX_VALUE}")

@Suppress("MagicNumber")
private val java8toJava16compatibility = mapOf(
    8 to gradle("2.0"),
    9 to gradle("4.3"),
    10 to gradle("4.7"),
    11 to gradle("5.0"),
    12 to gradle("5.4"),
    13 to gradle("6.0"),
    14 to gradle("6.3"),
    15 to gradle("6.7"),
    16 to gradle("7.0"),
).mapValues { it.value..gradle8X }

@Suppress("MagicNumber")
private val java17plusCompatibility = mapOf(
    17 to gradle("7.3"),
    18 to gradle("7.5"),
    19 to gradle("7.6"),
    20 to gradle("8.3"),
    21 to gradle("8.5"),
    22 to gradle("8.8"),
    23 to gradle("8.10"),
    24 to gradle("8.14"),
).mapValues { it.value..futureGradle }

/**
 * A map between java and gradle versions. From:
 * https://docs.gradle.org/current/userguide/compatibility.html
 */
val javaToGradleStatically: Map<Int, GradleRange> = java8toJava16compatibility + java17plusCompatibility

private fun gradle(version: String): GradleVersion = GradleVersion.version(version)

/**
 * Returns the range of Java versions supported by the given Gradle version.
 * If no specific range is found, it defaults to the latest known Java version.
 *
 * @param gradleVersion The Gradle version to check compatibility with.
 * @return An [IntRange] representing the supported Java versions.
 */
fun Map<Int, GradleRange>.javaRangeForGradle(gradleVersion: GradleVersion = GradleVersion.current()): IntRange {
    val validRanges = filterValues { gradleVersion in it }
    val minJava: Int = validRanges.keys.minOrNull() ?: OLDEST_SUPPORTED_BY_GRADLE
    val maxJava: Int = validRanges.keys.maxOrNull() ?: latestJava
    return minJava..maxJava
}
