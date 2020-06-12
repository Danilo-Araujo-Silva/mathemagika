package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             JohnsonDistribution
 *
 * Full name:        System`JohnsonDistribution
 *
 *                   JohnsonDistribution["SB", γ, δ, μ, σ] represents a bounded Johnson distribution with shape parameters γ, δ, location parameter μ, and scale parameter σ.
 *                   JohnsonDistribution["SL", γ, δ, μ, σ] represents a semi-bounded Johnson distribution.
 *                   JohnsonDistribution["SU", γ, δ, μ, σ] represents an unbounded Johnson distribution.
 * Usage:            JohnsonDistribution["SN", γ, δ, μ, σ] represents a normal Johnson distribution.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/JohnsonDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/JohnsonDistribution.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun johnsonDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("JohnsonDistribution", arguments.toMutableList(), options)
}
