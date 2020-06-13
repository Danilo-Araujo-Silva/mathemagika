package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AsymptoticProduct
 *
 * Full name:        System`AsymptoticProduct
 *
 *                   AsymptoticProduct[f, x, x  x ] computes an asymptotic approximation of the indefinite product ∏ f(x) for x near x .
 *                                                0                                                                 x                  0
 *                                                                                                                         b(α)
 *                   AsymptoticProduct[f, {x, a, b}, α  α ] computes an asymptotic approximation of the definite product ∏     f(x, α) for α near α .
 *                                                        0                                                                a(α)                     0
 *                   AsymptoticProduct[f, …, {ξ, ξ , n}] computes the asymptotic approximation to order n.
 * Usage:                                         0
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
 *                   local: paclet:ref/AsymptoticProduct
 * Documentation:    web: http://reference.wolfram.com/language/ref/AsymptoticProduct.html
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
fun asymptoticProduct(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AsymptoticProduct", arguments.toMutableList(), options)
}
