package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Probability
 *
 * Full name:        System`Probability
 *
 *                   Probability[pred, x  dist] gives the probability for an event that satisfies the predicate pred under the assumption that x follows the probability distribution dist.
 *                   Probability[pred, x  data] gives the probability for an event that satisfies the predicate pred under the assumption that x follows the probability distribution given by data.
 *                   Probability[pred, {x , x , …}  dist] gives the probability that an event satisfies pred under the assumption that {x , x , …} follows the multivariate distribution dist.
 *                                       1   2                                                                                            1   2
 *                   Probability[pred, {x   dist , x   dist , …}] gives the probability that an event satisfies pred under the assumption that x , x , … are independent and follow the distributions dist , dist , ….
 *                                       1       1   2       2                                                                                    1   2                                                     1      2
 *                   Probability[pred   pred , …] gives the conditional probability of pred  given pred .
 * Usage:                            1       2                                              1           2
 *
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> False
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Probability
 * Documentation:    web: http://reference.wolfram.com/language/ref/Probability.html
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
fun probability(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Probability", arguments.toMutableList(), options)
}
