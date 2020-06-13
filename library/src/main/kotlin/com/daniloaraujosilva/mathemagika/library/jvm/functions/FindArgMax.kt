package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FindArgMax
 *
 * Full name:        System`FindArgMax
 *
 *                   FindArgMax[f, x] gives the position x    of a local maximum of f.
 *                                                        max
 *                   FindArgMax[f, {x, x }] gives the position x    of a local maximum of f, found by a search starting from the point x = x .
 *                                      0                       max                                                                         0
 *                   FindArgMax[f, {{x, x }, {y, y }, …}] gives the position {x   , y   , …} of a local maximum of a function of several variables.
 *                                       0        0                            max   max
 *                   FindArgMax[{f, cons}, {{x, x }, {y, y }, …}] gives the position of a local maximum subject to the constraints cons.
 *                                               0        0
 * Usage:            FindArgMax[{f, cons}, {x, y, …}] starts from a point within the region defined by the constraints.
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
 *                   local: paclet:ref/FindArgMax
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindArgMax.html
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
fun findArgMax(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindArgMax", arguments.toMutableList(), options)
}
