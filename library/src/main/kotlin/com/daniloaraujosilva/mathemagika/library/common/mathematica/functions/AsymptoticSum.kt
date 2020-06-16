package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AsymptoticSum
 *
 * Full name:        System`AsymptoticSum
 *
 *                   AsymptoticSum[f, x, x  x ] computes an asymptotic approximation of the indefinite sum ∑ f(x) for x centered at x .
 *                                            0                                                                                       0
 *                                                                                                                 b(α)
 *                   AsymptoticSum[f, {x, a, b}, α  α ] computes an asymptotic approximation of the definite sum ∑     f(x, α) for α centered at α .
 *                                                    0                                                            a(α)                            0
 *                   AsymptoticSum[f, …, {ξ, ξ , n}] computes the asymptotic approximation to order n.
 * Usage:                                     0
 *
 *                   AccuracyGoal -> Automatic
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> Automatic
 *                   GeneratedParameters -> None
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PrecisionGoal -> Automatic
 *                   Regularization -> None
 *                   SeriesTermGoal -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AsymptoticSum
 * Documentation:    web: http://reference.wolfram.com/language/ref/AsymptoticSum.html
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
fun asymptoticSum(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AsymptoticSum", arguments.toMutableList(), options)
}
