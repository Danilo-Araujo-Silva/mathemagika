package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SechDistribution
 *
 * Full name:        System`SechDistribution
 *
 *                   SechDistribution[μ, σ] represents the hyperbolic secant distribution with location parameter μ and scale parameter σ.
 * Usage:            SechDistribution[] represents the hyperbolic secant distribution with location parameter 0 and scale parameter 1.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SechDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/SechDistribution.html
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
fun sechDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SechDistribution", arguments.toMutableList(), options)
}
