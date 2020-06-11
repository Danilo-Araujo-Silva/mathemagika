package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PassEventsUp
 *
 * Full name:        System`PassEventsUp
 *
 * Usage:            PassEventsUp is an option to EventHandler that specifies whether events handled by a particular event handler should be passed up to event handlers in outer expressions.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PassEventsUp
 * Documentation:    web: http://reference.wolfram.com/language/ref/PassEventsUp.html
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
fun passEventsUp(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PassEventsUp", arguments.toMutableList(), options)
}
