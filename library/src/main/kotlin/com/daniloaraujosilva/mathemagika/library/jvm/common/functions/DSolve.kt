package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DSolve
 *
 * Full name:        System`DSolve
 *
 *                   DSolve[eqn, u, x] solves a differential equation for the function u, with independent variable x.
 *                   DSolve[eqn, u, {x, x   , x   }] solves a differential equation for x between x    and x   .
 *                                       min   max                                                 min      max
 *                   DSolve[{eqn , eqn , …}, {u , u , …}, …] solves a list of differential equations.
 *                              1     2        1   2
 *                   DSolve[eqn, u, {x , x , …}] solves a partial differential equation.
 *                                    1   2
 *                   DSolve[eqn, u, {x , x , …} ∈ Ω] solves the partial differential equation eqn over the region Ω.
 * Usage:                             1   2
 *
 *                   Assumptions :> $Assumptions
 *                   DiscreteVariables -> {}
 *                   GeneratedParameters -> C
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DSolve
 * Documentation:    web: http://reference.wolfram.com/language/ref/DSolve.html
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
fun dSolve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DSolve", arguments.toMutableList(), options)
}
