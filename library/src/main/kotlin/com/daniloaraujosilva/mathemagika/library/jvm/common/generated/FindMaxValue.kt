package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FindMaxValue
 * 
 * Full name:        System`FindMaxValue
 * 
 *                   FindMaxValue[f, x] gives the value at a local maximum of f.
 *                   FindMaxValue[f, {x, x }] gives the value at a local maximum of f, found by a search starting from the point x = x . 
 *                                        0                                                                                           0
 *                   FindMaxValue[f, {{x, x }, {y, y }, …}] gives the value at a local maximum of a function of several variables. 
 *                                         0        0
 *                   FindMaxValue[{f, cons}, {{x, x }, {y, y }, …}] gives the value at a local maximum subject to the constraints cons.
 *                                                 0        0
 * Usage:            FindMaxValue[{f, cons}, {x, y, …}] starts from a point within the region defined by the constraints.
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
 *                   local: paclet:ref/FindMaxValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindMaxValue.html
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
fun findMaxValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindMaxValue", arguments.toMutableList(), options)
}
