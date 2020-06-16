package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AnimationRunning
 *
 * Full name:        System`AnimationRunning
 *
 * Usage:            AnimationRunning is an option to Animate and related functions that specifies whether the animation they create is running.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AnimationRunning
 * Documentation:    web: http://reference.wolfram.com/language/ref/AnimationRunning.html
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
fun animationRunning(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AnimationRunning", arguments.toMutableList(), options)
}
