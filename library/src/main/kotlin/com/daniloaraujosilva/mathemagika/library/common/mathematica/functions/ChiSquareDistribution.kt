package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ChiSquareDistribution
 *
 * Full name:        System`ChiSquareDistribution
 *
 *                                                          2
 * Usage:            ChiSquareDistribution[ν] represents a χ  distribution with ν degrees of freedom.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ChiSquareDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/ChiSquareDistribution.html
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
fun chiSquareDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ChiSquareDistribution", arguments.toMutableList(), options)
}
