package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LandauDistribution
 *
 * Full name:        System`LandauDistribution
 *
 *                   LandauDistribution[μ, σ] represents a Landau distribution with location parameter μ and scale parameter σ.
 * Usage:            LandauDistribution[] represents a Landau distribution with location parameter 0 and scale parameter 1.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LandauDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/LandauDistribution.html
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
fun landauDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LandauDistribution", arguments.toMutableList(), options)
}
