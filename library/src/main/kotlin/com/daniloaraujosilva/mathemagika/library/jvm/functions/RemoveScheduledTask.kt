package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RemoveScheduledTask
 *
 * Full name:        System`RemoveScheduledTask
 *
 * Usage:            RemoveScheduledTask[obj] removes obj from the list of currently scheduled local or cloud tasks.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RemoveScheduledTask
 * Documentation:    web: http://reference.wolfram.com/language/ref/RemoveScheduledTask.html
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
fun removeScheduledTask(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RemoveScheduledTask", arguments.toMutableList(), options)
}
