package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MinStableDistribution
 *
 * Full name:        System`MinStableDistribution
 *
 * Usage:            MinStableDistribution[μ, σ, ξ] represents a generalized minimum extreme value distribution with location parameter μ, scale parameter σ, and shape parameter ξ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MinStableDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/MinStableDistribution.html
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
fun minStableDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MinStableDistribution", arguments.toMutableList(), options)
}
