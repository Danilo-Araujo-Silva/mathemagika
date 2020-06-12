package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ScheduledTaskInformation
 *
 * Full name:        System`ScheduledTaskInformation
 *
 *                   ScheduledTaskInformation[CloudObject] returns information about a task.
 * Usage:            ScheduledTaskInformation[CloudObject, property] returns the value of the specified property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ScheduledTaskInformation
 * Documentation:    web: http://reference.wolfram.com/language/ref/ScheduledTaskInformation.html
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
fun scheduledTaskInformation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ScheduledTaskInformation", arguments.toMutableList(), options)
}
