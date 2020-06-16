package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DiscreteAsymptotic
 *
 * Full name:        System`DiscreteAsymptotic
 *
 *                   DiscreteAsymptotic[expr, n  ∞] gives an asymptotic approximation for expr as n tends to infinity over the integers.
 * Usage:            DiscreteAsymptotic[expr, {n, ∞, m}] gives an asymptotic series approximation for expr to order m.
 *
 *                   AccuracyGoal -> Automatic
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> Automatic
 *                   GeneratedParameters -> C
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PrecisionGoal -> Automatic
 *                   SeriesTermGoal -> 1
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DiscreteAsymptotic
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiscreteAsymptotic.html
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
fun discreteAsymptotic(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiscreteAsymptotic", arguments.toMutableList(), options)
}
