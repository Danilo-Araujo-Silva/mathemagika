package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MultinomialDistribution
 *
 * Full name:        System`MultinomialDistribution
 *
 *                   MultinomialDistribution[n, {p , p , …, p }] represents a multinomial distribution with n trials and probabilities p .
 * Usage:                                         1   2      m                                                                          i
 *
 * Options:          None
 *
 *                   NHoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MultinomialDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/MultinomialDistribution.html
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
fun multinomialDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MultinomialDistribution", arguments.toMutableList(), options)
}
