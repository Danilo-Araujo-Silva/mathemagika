package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NMinValue
 * 
 * Full name:        System`NMinValue
 * 
 *                   NMinValue[f, x] gives the minimum value of f with respect to x.
 *                   NMinValue[f, {x, y, …}] gives the minimum value of f with respect to x, y, …. 
 *                   NMinValue[{f, cons}, {x, y, …}] gives the minimum value of f subject to the constraints cons.
 * Usage:            NMinValue[…, x ∈ reg] constrains x to be in the region reg.
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
 *                   local: paclet:ref/NMinValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/NMinValue.html
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
fun nMinValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NMinValue", arguments.toMutableList(), options)
}
