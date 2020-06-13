package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NProbability
 *
 * Full name:        System`NProbability
 *
 *                   NProbability[pred, x  dist] gives the numerical probability for an event that satisfies the predicate pred under the assumption that x follows the probability distribution dist.
 *                   NProbability[pred, {x , x , …}  dist] gives the numerical probability that an event satisfies pred under the assumption that {x , x , …} follows the multivariate distribution dist.
 *                                        1   2                                                                                                      1   2
 *                   NProbability[pred, {x   dist , x   dist , …}] gives the numerical probability that an event satisfies pred under the assumption that x , x , … are independent and follow the distributions dist , dist , ….
 *                                        1       1   2       2                                                                                              1   2                                                     1      2
 *                   NProbability[pred   pred , …] gives the numerical conditional probability of pred  given pred .
 * Usage:                             1       2                                                        1           2
 *
 *                   AccuracyGoal -> Infinity
 *                   Compiled -> Automatic
 *                   Method -> Automatic
 *                   PrecisionGoal -> Automatic
 * Options:          WorkingPrecision -> MachinePrecision
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NProbability
 * Documentation:    web: http://reference.wolfram.com/language/ref/NProbability.html
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
fun nProbability(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NProbability", arguments.toMutableList(), options)
}
