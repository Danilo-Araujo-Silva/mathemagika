package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BetaNegativeBinomialDistribution
 *
 * Full name:        System`BetaNegativeBinomialDistribution
 *
 * Usage:            BetaNegativeBinomialDistribution[α, β, n] represents a beta negative binomial mixture distribution with beta distribution parameters α and β and n successful trials.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BetaNegativeBinomialDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/BetaNegativeBinomialDistribution.html
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
fun betaNegativeBinomialDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BetaNegativeBinomialDistribution", arguments.toMutableList(), options)
}
