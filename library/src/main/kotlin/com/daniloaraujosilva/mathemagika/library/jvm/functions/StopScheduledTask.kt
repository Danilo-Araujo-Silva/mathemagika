package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StopScheduledTask
 *
 * Full name:        System`StopScheduledTask
 *
 * Usage:            StopScheduledTask[obj] deactivates the local or cloud scheduled task represented by obj.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StopScheduledTask
 * Documentation:    web: http://reference.wolfram.com/language/ref/StopScheduledTask.html
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
fun stopScheduledTask(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StopScheduledTask", arguments.toMutableList(), options)
}
