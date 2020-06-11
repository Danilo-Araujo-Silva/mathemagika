package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ScheduledTask
 *
 * Full name:        System`ScheduledTask
 *
 * Usage:            ScheduledTask[expr, timespec] represents a scheduled task to be evaluated on the schedule defined by timespec.
 *
 *                   AutoRemove -> False
 *                   NotificationFunction -> Automatic
 * Options:          TimeZone -> Automatic
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ScheduledTask
 * Documentation:    web: http://reference.wolfram.com/language/ref/ScheduledTask.html
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
fun scheduledTask(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ScheduledTask", arguments.toMutableList(), options)
}
