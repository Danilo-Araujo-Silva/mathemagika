package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AbortScheduledTask
 *
 * Full name:        System`AbortScheduledTask
 *
 * Usage:            AbortScheduledTask[task] interrupts any currently evaluating instances of the cloud task task.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AbortScheduledTask
 * Documentation:    web: http://reference.wolfram.com/language/ref/AbortScheduledTask.html
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
fun abortScheduledTask(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AbortScheduledTask", arguments.toMutableList(), options)
}
