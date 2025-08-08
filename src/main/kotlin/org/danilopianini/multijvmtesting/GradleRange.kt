package org.danilopianini.multijvmtesting

import org.gradle.util.GradleVersion

/**
 * Represents a range of Gradle versions, starting at [start] and ending at [max], inclusive.
 * If [max] is null, the range is considered unbounded above.
 *
 * @param start The lower bound of the version range.
 * @param max The upper bound of the version range, or null for no upper bound.
 * @throws IllegalArgumentException if [start] is not less than [endInclusive].
 */
data class GradleRange(override val start: GradleVersion, private val max: GradleVersion?) :
    ClosedRange<GradleVersion>,
    Comparable<GradleRange> {

    init {
        require(start < endInclusive)
    }

    override val endInclusive: GradleVersion
        get() = max ?: GradleVersion.version("${Integer.MAX_VALUE}.${Integer.MAX_VALUE}")

    override fun toString(): String = when (max) {
        null -> "${start.version} and after"
        else -> "${start.version} to ${max.version}"
    }

    override fun compareTo(other: GradleRange): Int =
        compareBy<GradleRange> { endInclusive }.thenBy { start }.compare(this, other)
}
