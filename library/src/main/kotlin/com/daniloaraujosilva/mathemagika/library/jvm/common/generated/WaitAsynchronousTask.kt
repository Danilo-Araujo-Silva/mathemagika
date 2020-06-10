package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             WaitAsynchronousTask
 * 
 * Full name:        System`WaitAsynchronousTask
 * 
 * Usage:            WaitAsynchronousTask[task] waits for task to complete.
 * 
 * Options:          Timeout -> Infinity
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/WaitAsynchronousTask
 * Documentation:    web: http://reference.wolfram.com/language/ref/WaitAsynchronousTask.html
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
fun waitAsynchronousTask(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WaitAsynchronousTask", arguments.toMutableList(), options)
}
