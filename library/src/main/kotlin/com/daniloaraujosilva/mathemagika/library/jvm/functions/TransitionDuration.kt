package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TransitionDuration
 *
 * Full name:        System`TransitionDuration
 *
 * Usage:            TransitionDuration is an option for PaneSelector that specifies the duration in seconds that a transition effect should last.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TransitionDuration
 * Documentation:    web: http://reference.wolfram.com/language/ref/TransitionDuration.html
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
fun transitionDuration(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TransitionDuration", arguments.toMutableList(), options)
}
