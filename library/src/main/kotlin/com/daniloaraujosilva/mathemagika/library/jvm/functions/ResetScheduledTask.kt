package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ResetScheduledTask
 *
 * Full name:        System`ResetScheduledTask
 *
 *                   ResetScheduledTask[obj, timespec]  resets the timing for a scheduled task to timespec.
 * Usage:            ResetScheduledTask[obj, timespec, offset] resets the time offset for a scheduled task to offset.
 *
 *                   AutoRemove -> False
 *                   EpilogFunction :> Null
 * Options:          TaskGroup -> Global`
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ResetScheduledTask
 * Documentation:    web: http://reference.wolfram.com/language/ref/ResetScheduledTask.html
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
fun resetScheduledTask(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ResetScheduledTask", arguments.toMutableList(), options)
}
