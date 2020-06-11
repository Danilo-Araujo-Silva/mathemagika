package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Asymptotic
 *
 * Full name:        System`Asymptotic
 *
 *                   Asymptotic[expr, x  x ] gives an asymptotic approximation for expr near x .
 *                                         0                                                   0
 *                   Asymptotic[expr, {x, x , n}] gives an asymptotic approximation for expr near x  to order n.
 * Usage:                                  0                                                       0
 *
 *                   AccuracyGoal -> Automatic
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> Automatic
 *                   GeneratedParameters -> None
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PrecisionGoal -> Automatic
 *                   SeriesTermGoal -> 1
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Asymptotic
 * Documentation:    web: http://reference.wolfram.com/language/ref/Asymptotic.html
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
fun asymptotic(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Asymptotic", arguments.toMutableList(), options)
}
