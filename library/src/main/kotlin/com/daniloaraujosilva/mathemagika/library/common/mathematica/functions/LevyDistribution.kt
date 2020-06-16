package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LevyDistribution
 *
 * Full name:        System`LevyDistribution
 *
 * Usage:            LevyDistribution[μ, σ] represents a Lévy distribution with location parameter μ and dispersion parameter σ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LevyDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/LevyDistribution.html
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
fun levyDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LevyDistribution", arguments.toMutableList(), options)
}
