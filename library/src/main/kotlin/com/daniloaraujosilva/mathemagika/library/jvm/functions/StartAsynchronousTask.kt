package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StartAsynchronousTask
 *
 * Full name:        System`StartAsynchronousTask
 *
 * Usage:            StartAsynchronousTask[task] allows asynchronous evaluations from task after it has been stopped.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StartAsynchronousTask
 * Documentation:    web: http://reference.wolfram.com/language/ref/StartAsynchronousTask.html
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
fun startAsynchronousTask(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StartAsynchronousTask", arguments.toMutableList(), options)
}
