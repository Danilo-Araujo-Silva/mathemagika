package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TransitionEffect
 *
 * Full name:        System`TransitionEffect
 *
 * Usage:            TransitionEffect is an option for PaneSelector that specifies the visual effect used when transitioning between states.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TransitionEffect
 * Documentation:    web: http://reference.wolfram.com/language/ref/TransitionEffect.html
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
fun transitionEffect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TransitionEffect", arguments.toMutableList(), options)
}
