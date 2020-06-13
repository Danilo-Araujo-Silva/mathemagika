package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MaxStableDistribution
 *
 * Full name:        System`MaxStableDistribution
 *
 * Usage:            MaxStableDistribution[μ, σ, ξ] represents a generalized maximum extreme value distribution with location parameter μ, scale parameter σ, and shape parameter ξ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MaxStableDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaxStableDistribution.html
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
fun maxStableDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaxStableDistribution", arguments.toMutableList(), options)
}
