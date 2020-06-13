package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FindMinValue
 *
 * Full name:        System`FindMinValue
 *
 *                   FindMinValue[f, x] gives the value at a local minimum of f.
 *                   FindMinValue[f, {x, x }] gives the value at a local minimum of f, found by a search starting from the point x = x .
 *                                        0                                                                                           0
 *                   FindMinValue[f, {{x, x }, {y, y }, …}] gives the value at a local minimum of a function of several variables.
 *                                         0        0
 *                   FindMinValue[{f, cons}, {{x, x }, {y, y }, …}] gives the value at a local minimum subject to the constraints cons.
 *                                                 0        0
 * Usage:            FindMinValue[{f, cons}, {x, y, …}] starts from a point within the region defined by the constraints.
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
 *                   local: paclet:ref/FindMinValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindMinValue.html
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
fun findMinValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindMinValue", arguments.toMutableList(), options)
}
