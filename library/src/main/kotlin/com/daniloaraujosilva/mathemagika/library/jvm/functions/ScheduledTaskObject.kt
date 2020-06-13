package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ScheduledTaskObject
 *
 * Full name:        System`ScheduledTaskObject
 *
 * Usage:            ScheduledTaskObject[id, expr, spec, …] is a task object specifying future evaluation of expr according to spec.
 *
 * Options:          None
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ScheduledTaskObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/ScheduledTaskObject.html
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
fun scheduledTaskObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ScheduledTaskObject", arguments.toMutableList(), options)
}
