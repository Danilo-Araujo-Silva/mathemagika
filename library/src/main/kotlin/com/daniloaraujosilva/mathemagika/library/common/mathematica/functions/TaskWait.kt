package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TaskWait
 *
 * Full name:        System`TaskWait
 *
 * Usage:            TaskWait[task] waits for the specified task to be completely finished.
 *
 * Options:          TimeConstraint -> Infinity
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TaskWait
 * Documentation:    web: http://reference.wolfram.com/language/ref/TaskWait.html
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
fun taskWait(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TaskWait", arguments.toMutableList(), options)
}
