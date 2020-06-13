package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AsymptoticIntegrate
 *
 * Full name:        System`AsymptoticIntegrate
 *
 *                   AsymptoticIntegrate[f, x, x  x ] computes an asymptotic approximation of the indefinite integral ∫ f(x)  x for x centered at x .
 *                                                  0                                                                                                0
 *                                                                                                                            b(α)
 *                   AsymptoticIntegrate[f, {x, a, b}, α  α ] computes an asymptotic approximation of the definite integral ∫     f(x, α)  x for α centered at α .
 *                                                          0                                                                 a(α)                                0
 *                   AsymptoticIntegrate[f, …, {ξ, ξ , n}] computes the asymptotic approximation to order n.
 * Usage:                                           0
 *
 *                   AccuracyGoal -> Automatic
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> Automatic
 *                   GeneratedParameters -> None
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PrecisionGoal -> Automatic
 *                   SeriesTermGoal -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AsymptoticIntegrate
 * Documentation:    web: http://reference.wolfram.com/language/ref/AsymptoticIntegrate.html
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
fun asymptoticIntegrate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AsymptoticIntegrate", arguments.toMutableList(), options)
}
