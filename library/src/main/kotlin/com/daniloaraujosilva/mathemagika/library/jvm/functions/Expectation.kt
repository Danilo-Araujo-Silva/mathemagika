package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Expectation
 *
 * Full name:        System`Expectation
 *
 *                   Expectation[expr, x  dist] gives the expectation of expr under the assumption that x follows the probability distribution dist.
 *                   Expectation[expr, x  data] gives the expectation of expr under the assumption that x follows the probability distribution given by data.
 *                   Expectation[expr, {x , x , …}  dist] gives the expectation of expr under the assumption that {x , x , …} follows the multivariate distribution dist.
 *                                       1   2                                                                       1   2
 *                   Expectation[expr, {x   dist , x   dist , …}] gives the expectation of expr under the assumption that x , x , … are independent and follow the distributions dist , dist , ….
 *                                       1       1   2       2                                                               1   2                                                     1      2
 * Usage:            Expectation[expr  pred, …] gives the conditional expectation of expr given pred.
 *
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> False
 *                   Method -> Automatic
 * Options:          TargetUnits -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Expectation
 * Documentation:    web: http://reference.wolfram.com/language/ref/Expectation.html
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
fun expectation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Expectation", arguments.toMutableList(), options)
}
