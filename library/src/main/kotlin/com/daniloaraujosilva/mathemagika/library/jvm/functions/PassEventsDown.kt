package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PassEventsDown
 *
 * Full name:        System`PassEventsDown
 *
 * Usage:            PassEventsDown is an option to EventHandler which specifies whether events handled by a particular event handler should be passed down to event handlers nested inside.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PassEventsDown
 * Documentation:    web: http://reference.wolfram.com/language/ref/PassEventsDown.html
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
fun passEventsDown(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PassEventsDown", arguments.toMutableList(), options)
}
