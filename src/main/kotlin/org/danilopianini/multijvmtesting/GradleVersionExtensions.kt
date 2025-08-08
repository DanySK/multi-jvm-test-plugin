package org.danilopianini.multijvmtesting

import org.gradle.util.GradleVersion

/**
 * Creates a [GradleRange] from this version up to [endInclusive], inclusive.
 *
 * @receiver The starting Gradle version.
 * @param endInclusive The upper bound of the range, or null for no upper bound.
 * @return A [GradleRange] spanning from the receiver to [endInclusive].
 */
operator fun GradleVersion.rangeTo(endInclusive: GradleVersion?): GradleRange = GradleRange(this, endInclusive)
