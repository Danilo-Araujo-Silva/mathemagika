package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NMinimize
 *
 * Full name:        System`NMinimize
 *
 *                   NMinimize[f, x] minimizes f numerically with respect to x.
 *                   NMinimize[f, {x, y, …}] minimizes f numerically with respect to x, y, ….
 *                   NMinimize[{f, cons}, {x, y, …}] minimizes f numerically subject to the constraints cons.
 * Usage:            NMinimize[…, x ∈ reg] constrains x to be in the region reg.
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
 *                   local: paclet:ref/NMinimize
 * Documentation:    web: http://reference.wolfram.com/language/ref/NMinimize.html
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
fun nMinimize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NMinimize", arguments.toMutableList(), options)
}
