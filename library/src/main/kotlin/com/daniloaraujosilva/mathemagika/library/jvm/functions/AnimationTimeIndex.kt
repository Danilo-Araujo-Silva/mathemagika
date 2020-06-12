package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AnimationTimeIndex
 *
 * Full name:        System`AnimationTimeIndex
 *
 * Usage:            AnimationTimeIndex is an option to Animator and related functions that specifies the current time index for the animator.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AnimationTimeIndex
 * Documentation:    web: http://reference.wolfram.com/language/ref/AnimationTimeIndex.html
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
fun animationTimeIndex(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AnimationTimeIndex", arguments.toMutableList(), options)
}
