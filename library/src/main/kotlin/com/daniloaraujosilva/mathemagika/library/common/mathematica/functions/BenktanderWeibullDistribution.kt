package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BenktanderWeibullDistribution
 *
 * Full name:        System`BenktanderWeibullDistribution
 *
 * Usage:            BenktanderWeibullDistribution[a, b] represents a Benktander distribution of type II with parameters a and b.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BenktanderWeibullDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/BenktanderWeibullDistribution.html
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
fun benktanderWeibullDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BenktanderWeibullDistribution", arguments.toMutableList(), options)
}
