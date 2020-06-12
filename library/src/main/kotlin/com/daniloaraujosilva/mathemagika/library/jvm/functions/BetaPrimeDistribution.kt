package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BetaPrimeDistribution
 *
 * Full name:        System`BetaPrimeDistribution
 *
 *                   BetaPrimeDistribution[p, q] represents a beta prime distribution with shape parameters p and q.
 *                   BetaPrimeDistribution[p, q, β] represents a generalized beta prime distribution with scale parameter β.
 * Usage:            BetaPrimeDistribution[p, q, α, β] represents a generalized beta distribution of the second kind with shape parameter α.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BetaPrimeDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/BetaPrimeDistribution.html
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
fun betaPrimeDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BetaPrimeDistribution", arguments.toMutableList(), options)
}
