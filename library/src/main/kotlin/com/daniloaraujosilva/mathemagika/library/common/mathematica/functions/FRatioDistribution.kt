package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FRatioDistribution
 *
 * Full name:        System`FRatioDistribution
 *
 * Usage:            FRatioDistribution[n, m] represents an F-ratio distribution with n numerator and m denominator degrees of freedom.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FRatioDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/FRatioDistribution.html
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
fun fRatioDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FRatioDistribution", arguments.toMutableList(), options)
}
