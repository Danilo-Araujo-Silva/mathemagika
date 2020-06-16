package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GeneratingFunction
 *
 * Full name:        System`GeneratingFunction
 *
 *                                                                                                              th
 *                   GeneratingFunction[expr, n, x] gives the generating function in x for the sequence whose n   series coefficient is given by the expression expr.
 *                   GeneratingFunction[expr, {n , n , …}, {x , x , …}] gives the multidimensional generating function in x , x , … whose n , n , … coefficient is given by expr.
 * Usage:                                       1   2        1   2                                                         1   2           1   2
 *
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> False
 *                   Method -> Automatic
 * Options:          VerifyConvergence -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeneratingFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeneratingFunction.html
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
fun generatingFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeneratingFunction", arguments.toMutableList(), options)
}
