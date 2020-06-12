package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StableDistribution
 *
 * Full name:        System`StableDistribution
 *
 *                   StableDistribution[type, α, β, μ, σ] represents the stable distribution S     with index of stability α, skewness parameter β, location parameter μ, and scale parameter σ.
 * Usage:                                                                                     type
 *
 * Options:          None
 *
 *                   NHoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StableDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/StableDistribution.html
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
fun stableDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StableDistribution", arguments.toMutableList(), options)
}
