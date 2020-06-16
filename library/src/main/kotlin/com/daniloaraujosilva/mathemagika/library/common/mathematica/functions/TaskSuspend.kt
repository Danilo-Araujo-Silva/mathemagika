package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TaskSuspend
 *
 * Full name:        System`TaskSuspend
 *
 * Usage:            TaskSuspend[task] suspends the execution of the specified task.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TaskSuspend
 * Documentation:    web: http://reference.wolfram.com/language/ref/TaskSuspend.html
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
fun taskSuspend(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TaskSuspend", arguments.toMutableList(), options)
}
