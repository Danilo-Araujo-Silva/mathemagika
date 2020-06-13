package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NArgMax
 *
 * Full name:        System`NArgMax
 *
 *                   NArgMax[f, x] gives a position x    at which f is numerically maximized.
 *                                                   max
 *                   NArgMax[f, {x, y, …}] gives a position {x   , y   , …} at which f is numerically maximized.
 *                                                            max   max
 *                   NArgMax[{f, cons}, {x, y, …}] gives a position at which f is numerically maximized subject to the constraints cons.
 * Usage:            NArgMax[…, x ∈ reg] constrains x to be in the region reg.
 *
 *                   AccuracyGoal -> Automatic
 *                   EvaluationMonitor -> None
 *                   MaxIterations -> Automatic
 *                   Method -> Automatic
 *                   PrecisionGoal -> Automatic
 *                   StepMonitor -> None
 * Options:          WorkingPrecision -> MachinePrecision
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NArgMax
 * Documentation:    web: http://reference.wolfram.com/language/ref/NArgMax.html
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
fun nArgMax(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NArgMax", arguments.toMutableList(), options)
}
