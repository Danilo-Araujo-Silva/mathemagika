package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DSolveValue
 *
 * Full name:        System`DSolveValue
 *
 *                   DSolveValue[eqn, expr, x] gives the value of expr determined by a symbolic solution to the ordinary differential equation eqn with independent variable x.
 *                   DSolveValue[eqn, expr, {x, x   , x   }] uses a symbolic solution for x between x    and x   .
 *                                               min   max                                           min      max
 *                   DSolveValue[{eqn , eqn , …}, expr, …] uses a symbolic solution for a list of differential equations.
 *                                   1     2
 *                   DSolveValue[eqn, expr, {x , x , …}] uses a solution for the partial differential equation eqn.
 *                                            1   2
 *                   DSolveValue[eqn, expr, {x , x , …} ∈ Ω] uses a solution of the partial differential equation eqn over the region Ω.
 * Usage:                                     1   2
 *
 *                   Assumptions :> $Assumptions
 *                   DependentVariables -> Automatic
 *                   DiscreteVariables -> {}
 *                   GeneratedParameters -> C
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DSolveValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/DSolveValue.html
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
fun dSolveValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DSolveValue", arguments.toMutableList(), options)
}
