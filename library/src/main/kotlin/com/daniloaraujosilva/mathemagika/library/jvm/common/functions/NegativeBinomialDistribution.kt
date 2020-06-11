package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NegativeBinomialDistribution
 *
 * Full name:        System`NegativeBinomialDistribution
 *
 * Usage:            NegativeBinomialDistribution[n, p] represents a negative binomial distribution with parameters n and p.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NegativeBinomialDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/NegativeBinomialDistribution.html
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
fun negativeBinomialDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NegativeBinomialDistribution", arguments.toMutableList(), options)
}
