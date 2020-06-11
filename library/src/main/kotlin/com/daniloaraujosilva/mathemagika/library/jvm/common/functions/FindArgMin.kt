package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindArgMin
 *
 * Full name:        System`FindArgMin
 *
 *                   FindArgMin[f, x] gives the position x    of a local minimum of f.
 *                                                        min
 *                   FindArgMin[f, {x, x }] gives the position x    of a local minimum of f, found by a search starting from the point x = x .
 *                                      0                       min                                                                         0
 *                   FindArgMin[f, {{x, x }, {y, y }, …}] gives the position {x   , y   , …} of a local minimum of a function of several variables.
 *                                       0        0                            min   min
 *                   FindArgMin[{f, cons}, {{x, x }, {y, y }, …}] gives the position of a local minimum subject to the constraints cons.
 *                                               0        0
 * Usage:            FindArgMin[{f, cons}, {x, y, …}] starts from a point within the region defined by the constraints.
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
 *                   local: paclet:ref/FindArgMin
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindArgMin.html
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
fun findArgMin(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindArgMin", arguments.toMutableList(), options)
}
