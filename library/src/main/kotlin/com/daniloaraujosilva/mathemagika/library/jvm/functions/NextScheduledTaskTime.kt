package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NextScheduledTaskTime
 *
 * Full name:        System`NextScheduledTaskTime
 *
 * Usage:            NextScheduledTaskTime[obj] gives the next execution time of the scheduled task represented by obj.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NextScheduledTaskTime
 * Documentation:    web: http://reference.wolfram.com/language/ref/NextScheduledTaskTime.html
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
fun nextScheduledTaskTime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NextScheduledTaskTime", arguments.toMutableList(), options)
}
