package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TransitionDirection
 *
 * Full name:        System`TransitionDirection
 *
 * Usage:            TransitionDirection is an option for PaneSelector that specifies the direction in which a transition moves.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TransitionDirection
 * Documentation:    web: http://reference.wolfram.com/language/ref/TransitionDirection.html
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
fun transitionDirection(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TransitionDirection", arguments.toMutableList(), options)
}
