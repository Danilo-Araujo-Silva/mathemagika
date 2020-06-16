package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NegativeMultinomialDistribution
 *
 * Full name:        System`NegativeMultinomialDistribution
 *
 * Usage:            NegativeMultinomialDistribution[n, p] represents a negative multinomial distribution with parameter n and failure probability vector p.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NegativeMultinomialDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/NegativeMultinomialDistribution.html
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
fun negativeMultinomialDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NegativeMultinomialDistribution", arguments.toMutableList(), options)
}
