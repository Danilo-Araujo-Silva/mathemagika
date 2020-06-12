package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AsymptoticSolve
 *
 * Full name:        System`AsymptoticSolve
 *
 *                   AsymptoticSolve[eqn, y  b, x -> a] computes asymptotic approximations of solutions y[x] of the equation eqn passing through {a, b}.
 *                   AsymptoticSolve[eqn, {y}, x -> a] computes asymptotic approximations of solutions y[x] of the equation eqn for x near a.
 *                   AsymptoticSolve[eqns, {y , y , …}  {b , b , …}, {x , x , …}  {a , a , …}] computes asymptotic approximations of solutions {y [x , x , …], y [x , x , …], …} of the system of equations eqns.
 *                                           1   2         1   2        1   2         1   2                                                        1  1   2       2  1   2
 *                   AsymptoticSolve[eqns, …, {{x , x , …}, {a , a , …}, n}] computes the asymptotic approximation to order n.
 *                                               1   2        1   2
 * Usage:            AsymptoticSolve[…, Reals] computes only solutions that are real valued for real argument values.
 *
 *                   Assumptions :> $Assumptions
 *                   Direction -> Automatic
 *                   GenerateConditions -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 * Options:          SeriesTermGoal -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AsymptoticSolve
 * Documentation:    web: http://reference.wolfram.com/language/ref/AsymptoticSolve.html
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
fun asymptoticSolve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AsymptoticSolve", arguments.toMutableList(), options)
}
