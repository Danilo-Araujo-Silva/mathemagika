package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StopAsynchronousTask
 *
 * Full name:        System`StopAsynchronousTask
 *
 * Usage:            StopAsynchronousTask[task] stops asynchronous evaluations from task.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StopAsynchronousTask
 * Documentation:    web: http://reference.wolfram.com/language/ref/StopAsynchronousTask.html
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
fun stopAsynchronousTask(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StopAsynchronousTask", arguments.toMutableList(), options)
}
