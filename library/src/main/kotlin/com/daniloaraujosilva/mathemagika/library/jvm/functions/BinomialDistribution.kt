package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BinomialDistribution
 *
 * Full name:        System`BinomialDistribution
 *
 * Usage:            BinomialDistribution[n, p] represents a binomial distribution with n trials and success probability p.
 *
 * Options:          None
 *
 *                   NHoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BinomialDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/BinomialDistribution.html
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
fun binomialDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BinomialDistribution", arguments.toMutableList(), options)
}
