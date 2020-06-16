package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NMaxValue
 *
 * Full name:        System`NMaxValue
 *
 *                   NMaxValue[f, x] gives the maximum value of f with respect to x.
 *                   NMaxValue[f, {x, y, …}] gives the maximum value of f with respect to x, y, ….
 *                   NMaxValue[{f, cons}, {x, y, …}] gives the maximum value of f subject to the constraints cons.
 * Usage:            NMaxValue[…, x ∈ reg] constrains x to be in the region reg.
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
 *                   local: paclet:ref/NMaxValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/NMaxValue.html
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
fun nMaxValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NMaxValue", arguments.toMutableList(), options)
}
