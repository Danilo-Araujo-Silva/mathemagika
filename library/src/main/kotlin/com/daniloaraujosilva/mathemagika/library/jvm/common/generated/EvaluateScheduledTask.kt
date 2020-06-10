package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             EvaluateScheduledTask
 * 
 * Full name:        System`EvaluateScheduledTask
 * 
 * Usage:            EvaluateScheduledTask[expr] triggers immediate local execution of the specified task object.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/EvaluateScheduledTask
 * Documentation:    web: http://reference.wolfram.com/language/ref/EvaluateScheduledTask.html
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
fun evaluateScheduledTask(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EvaluateScheduledTask", arguments.toMutableList(), options)
}
