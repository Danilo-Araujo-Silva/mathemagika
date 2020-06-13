package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AnimationRunTime
 *
 * Full name:        System`AnimationRunTime
 *
 * Usage:            AnimationRunTime is an option to Animator and related functions that indicates how long the animation has been continuously running.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AnimationRunTime
 * Documentation:    web: http://reference.wolfram.com/language/ref/AnimationRunTime.html
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
fun animationRunTime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AnimationRunTime", arguments.toMutableList(), options)
}
