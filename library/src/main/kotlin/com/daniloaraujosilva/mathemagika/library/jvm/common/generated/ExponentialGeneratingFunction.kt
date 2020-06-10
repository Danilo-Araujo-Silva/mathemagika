package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ExponentialGeneratingFunction
 * 
 * Full name:        System`ExponentialGeneratingFunction
 * 
 *                                                                                                                                     th
 *                   ExponentialGeneratingFunction[expr, n, x] gives the exponential generating function in x for the sequence whose n   term is given by the expression expr.
 *                   ExponentialGeneratingFunction[expr, {n , n , …}, {x , x , …}] gives the multidimensional exponential generating function in x , x , … whose n , n , … term is given by expr.
 * Usage:                                                  1   2        1   2                                                                     1   2           1   2
 * 
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> False
 *                   Method -> Automatic
 * Options:          VerifyConvergence -> True
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ExponentialGeneratingFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExponentialGeneratingFunction.html
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
fun exponentialGeneratingFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExponentialGeneratingFunction", arguments.toMutableList(), options)
}
