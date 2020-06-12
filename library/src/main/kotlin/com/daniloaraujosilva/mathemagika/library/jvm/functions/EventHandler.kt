package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EventHandler
 *
 * Full name:        System`EventHandler
 *
 *                   EventHandler[expr, {event  :> action , event  :> action , …}] displays as expr, evaluating action  whenever "event " occurs in connection with expr.
 * Usage:                                     1          1       2          2                                         i                i
 *
 *                   Method -> Preemptive
 *                   PassEventsDown -> Automatic
 * Options:          PassEventsUp -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EventHandler
 * Documentation:    web: http://reference.wolfram.com/language/ref/EventHandler.html
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
fun eventHandler(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EventHandler", arguments.toMutableList(), options)
}
