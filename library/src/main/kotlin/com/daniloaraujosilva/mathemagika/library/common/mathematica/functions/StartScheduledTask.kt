package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             StartScheduledTask
 *
 * Full name:        System`StartScheduledTask
 *
 * Usage:            StartScheduledTask[obj] starts the local or cloud scheduled task represented by obj.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StartScheduledTask
 * Documentation:    web: http://reference.wolfram.com/language/ref/StartScheduledTask.html
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
fun startScheduledTask(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StartScheduledTask", arguments.toMutableList(), options)
}
