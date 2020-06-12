package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AsymptoticRSolveValue
 *
 * Full name:        System`AsymptoticRSolveValue
 *
 *                   AsymptoticRSolveValue[eqn, f, x  ∞] computes an asymptotic approximation to the difference equation eqn for f[x] near ∞.
 *                   AsymptoticRSolveValue[{eqn , eqn , …}, {f , f , …}, x  ∞] computes an asymptotic approximation to a system of difference equations.
 *                                             1     2        1   2
 *                   AsymptoticRSolveValue[eqn, f, x, ϵ  ϵ ] computes an asymptotic approximation of f[x, ϵ] for the parameter ϵ centered at ϵ .
 *                                                         0                                                                                   0
 *                   AsymptoticRSolveValue[eqn, f, …, {ξ, ξ , n}] computes the asymptotic approximation to order n.
 * Usage:                                                  0
 *
 *                   AccuracyGoal -> Automatic
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> Automatic
 *                   GeneratedParameters -> C
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PrecisionGoal -> Automatic
 *                   SeriesTermGoal -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AsymptoticRSolveValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/AsymptoticRSolveValue.html
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
fun asymptoticRSolveValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AsymptoticRSolveValue", arguments.toMutableList(), options)
}
