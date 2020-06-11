package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RSolveValue
 *
 * Full name:        System`RSolveValue
 *
 *                   RSolveValue[eqn, expr, n] gives the value of expr determined by a symbolic solution to the ordinary difference equation eqn with independent variable n.
 *                   RSolveValue[{eqn , eqn , …}, expr, …] uses a symbolic solution for a list of difference equations.
 *                                   1     2
 *                   RSolveValue[eqn, expr, {n , n , …}] uses a solution for the partial recurrence equation eqn.
 * Usage:                                     1   2
 *
 *                   Assumptions :> $Assumptions
 *                   DependentVariables -> Automatic
 *                   GeneratedParameters -> C
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RSolveValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/RSolveValue.html
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
fun rSolveValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RSolveValue", arguments.toMutableList(), options)
}
