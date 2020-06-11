package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NMaximize
 *
 * Full name:        System`NMaximize
 *
 *                   NMaximize[f, x] maximizes f numerically with respect to x.
 *                   NMaximize[f, {x, y, …}] maximizes f numerically with respect to x, y, ….
 *                   NMaximize[{f, cons}, {x, y, …}] maximizes f numerically subject to the constraints cons.
 * Usage:            NMaximize[…, x ∈ reg] constrains x to be in the region reg.
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
 *                   local: paclet:ref/NMaximize
 * Documentation:    web: http://reference.wolfram.com/language/ref/NMaximize.html
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
fun nMaximize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NMaximize", arguments.toMutableList(), options)
}
