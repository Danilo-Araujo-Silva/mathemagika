package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ScheduledTasks
 *
 * Full name:        System`ScheduledTasks
 *
 * Usage:            ScheduledTasks[] returns a list of ScheduledTaskObject and CloudObject expressions that represent current tasks.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ScheduledTasks
 * Documentation:    web: http://reference.wolfram.com/language/ref/ScheduledTasks.html
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
fun scheduledTasks(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ScheduledTasks", arguments.toMutableList(), options)
}
