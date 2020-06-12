package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NArgMin
 *
 * Full name:        System`NArgMin
 *
 *                   NArgMin[f, x] gives a position x    at which f is numerically minimized.
 *                                                   min
 *                   NArgMin[f, {x, y, …}] gives a position {x   , y   , …} at which f is numerically minimized.
 *                                                            min   min
 *                   NArgMin[{f, cons}, {x, y, …}] gives a position at which f is numerically minimized subject to the constraints cons.
 * Usage:            NArgMin[…, x ∈ reg] constrains x to be in the region reg.
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
 *                   local: paclet:ref/NArgMin
 * Documentation:    web: http://reference.wolfram.com/language/ref/NArgMin.html
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
fun nArgMin(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NArgMin", arguments.toMutableList(), options)
}
