package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindMaximum
 *
 * Full name:        System`FindMaximum
 *
 *                   FindMaximum[f, x] searches for a local maximum in f, starting from an automatically selected point.
 *                   FindMaximum[f, {x, x }] searches for a local maximum in f, starting from the point x = x .
 *                                       0                                                                   0
 *                   FindMaximum[f, {{x, x }, {y, y }, …}] searches for a local maximum in a function of several variables.
 *                                        0        0
 *                   FindMaximum[{f, cons}, {{x, x }, {y, y }, …}] searches for a local maximum subject to the constraints cons.
 *                                                0        0
 * Usage:            FindMaximum[{f, cons}, {x, y, …}] starts from a point within the region defined by the constraints.
 *
 *                   AccuracyGoal -> Automatic
 *                   Compiled -> Automatic
 *                   EvaluationMonitor -> None
 *                   Gradient -> Automatic
 *                   MaxIterations -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PrecisionGoal -> Automatic
 *                   StepMonitor -> None
 * Options:          WorkingPrecision -> MachinePrecision
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindMaximum
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindMaximum.html
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
fun findMaximum(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindMaximum", arguments.toMutableList(), options)
}
