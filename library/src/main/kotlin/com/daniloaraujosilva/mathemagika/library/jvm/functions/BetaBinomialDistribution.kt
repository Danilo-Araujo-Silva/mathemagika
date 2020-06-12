package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BetaBinomialDistribution
 *
 * Full name:        System`BetaBinomialDistribution
 *
 * Usage:            BetaBinomialDistribution[α, β, n] represents a beta binomial mixture distribution with beta distribution parameters α and β, and n binomial trials.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BetaBinomialDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/BetaBinomialDistribution.html
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
fun betaBinomialDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BetaBinomialDistribution", arguments.toMutableList(), options)
}
