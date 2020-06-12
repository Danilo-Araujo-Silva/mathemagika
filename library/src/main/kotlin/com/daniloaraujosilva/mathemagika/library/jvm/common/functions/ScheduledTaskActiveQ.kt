package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ScheduledTaskActiveQ
 *
 * Full name:        System`ScheduledTaskActiveQ
 *
 * Usage:            ScheduledTaskActiveQ[obj] yields True if obj represents an active task, and False otherwise.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ScheduledTaskActiveQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/ScheduledTaskActiveQ.html
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
fun scheduledTaskActiveQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ScheduledTaskActiveQ", arguments.toMutableList(), options)
}