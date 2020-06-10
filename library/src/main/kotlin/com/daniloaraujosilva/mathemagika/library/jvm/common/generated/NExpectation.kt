package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NExpectation
 * 
 * Full name:        System`NExpectation
 * 
 *                   NExpectation[expr, x  dist] gives the numerical expectation of expr under the assumption that x follows the probability distribution dist.
 *                   NExpectation[expr, {x , x , …}  dist] gives the numerical expectation of expr under the assumption that {x , x , …} follows the multivariate distribution dist. 
 *                                        1   2                                                                                 1   2
 *                   NExpectation[expr, {x   dist , x   dist , …}] gives the numerical expectation of expr under the assumption that x , x , … are independent and follow the distributions dist , dist , …. 
 *                                        1       1   2       2                                                                         1   2                                                     1      2
 * Usage:            NExpectation[expr  pred, …] gives the numerical conditional expectation of expr given pred.
 * 
 *                   AccuracyGoal -> Infinity
 *                   Compiled -> Automatic
 *                   Method -> Automatic
 *                   PrecisionGoal -> Automatic
 *                   TargetUnits -> Automatic
 * Options:          WorkingPrecision -> MachinePrecision
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/NExpectation
 * Documentation:    web: http://reference.wolfram.com/language/ref/NExpectation.html
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
fun nExpectation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NExpectation", arguments.toMutableList(), options)
}
