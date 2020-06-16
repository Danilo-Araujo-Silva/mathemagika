package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             OrderDistribution
 *
 * Full name:        System`OrderDistribution
 *
 *                                                                    th
 *                   OrderDistribution[{dist, n}, k] represents the k  -order statistics distribution for n observations from the distribution dist.
 *                                                                                              th
 *                   OrderDistribution[{dist, n}, {k , k , …}] represents the joint (k , k , …)  -order statistics distribution from n observations from the distribution dist.
 *                                                  1   2                             1   2
 *                   OrderDistribution[{dist , …, dist }, …] represents the order statistics distribution for independent distributions dist .
 *                                          1         n                                                                                     i
 * Usage:            OrderDistribution[mdist, …] represents the order statistics distribution for multivariate distribution mdist.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/OrderDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/OrderDistribution.html
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
fun orderDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OrderDistribution", arguments.toMutableList(), options)
}
