package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WhenEvent
 *
 * Full name:        System`WhenEvent
 *
 * Usage:            WhenEvent[event, action] specifies an action that occurs when the event triggers it for equations in NDSolve and related functions.
 *
 *                   DetectionMethod -> Automatic
 *                   IntegrateEvent -> Automatic
 *                   LocationMethod -> Automatic
 * Options:          Priority -> Automatic
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WhenEvent
 * Documentation:    web: http://reference.wolfram.com/language/ref/WhenEvent.html
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
fun whenEvent(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WhenEvent", arguments.toMutableList(), options)
}
