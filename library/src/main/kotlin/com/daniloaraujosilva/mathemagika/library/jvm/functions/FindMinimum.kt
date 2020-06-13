package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FindMinimum
 *
 * Full name:        System`FindMinimum
 *
 *                   FindMinimum[f, x] searches for a local minimum in f, starting from an automatically selected point.
 *                   FindMinimum[f, {x, x }] searches for a local minimum in f, starting from the point x = x .
 *                                       0                                                                   0
 *                   FindMinimum[f, {{x, x }, {y, y }, …}] searches for a local minimum in a function of several variables.
 *                                        0        0
 *                   FindMinimum[{f, cons}, {{x, x }, {y, y }, …}] searches for a local minimum subject to the constraints cons.
 *                                                0        0
 * Usage:            FindMinimum[{f, cons}, {x, y, …}] starts from a point within the region defined by the constraints.
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
 *                   local: paclet:ref/FindMinimum
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindMinimum.html
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
fun findMinimum(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindMinimum", arguments.toMutableList(), options)
}
