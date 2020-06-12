package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MoyalDistribution
 *
 * Full name:        System`MoyalDistribution
 *
 *                   MoyalDistribution[μ, σ] represents a Moyal distribution with location parameter μ and scale parameter σ.
 * Usage:            MoyalDistribution[] represents a Moyal distribution with location parameter 0 and scale parameter 1.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MoyalDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/MoyalDistribution.html
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
fun moyalDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MoyalDistribution", arguments.toMutableList(), options)
}
