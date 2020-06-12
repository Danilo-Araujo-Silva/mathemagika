package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TaskExecute
 *
 * Full name:        System`TaskExecute
 *
 * Usage:            TaskExecute[task] immediately executes an instance of the specified task, independently of any schedule given.
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TaskExecute
 * Documentation:    web: http://reference.wolfram.com/language/ref/TaskExecute.html
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
fun taskExecute(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TaskExecute", arguments.toMutableList(), options)
}
