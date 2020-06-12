package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DefaultDuration
 *
 * Full name:        System`DefaultDuration
 *
 * Usage:            DefaultDuration is an option to Animate and related functions that specifies the default total duration of the animation in seconds.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DefaultDuration
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefaultDuration.html
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
fun defaultDuration(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefaultDuration", arguments.toMutableList(), options)
}
