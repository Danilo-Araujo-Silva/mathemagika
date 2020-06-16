package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RemoveAsynchronousTask
 *
 * Full name:        System`RemoveAsynchronousTask
 *
 * Usage:            RemoveAsynchronousTask[asyncTask] stops asynchronous evaluations and removes asyncTask from the system.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RemoveAsynchronousTask
 * Documentation:    web: http://reference.wolfram.com/language/ref/RemoveAsynchronousTask.html
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
fun removeAsynchronousTask(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RemoveAsynchronousTask", arguments.toMutableList(), options)
}
