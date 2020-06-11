package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AnimationCycleOffset
 *
 * Full name:        System`AnimationCycleOffset
 *
 * Usage:            AnimationCycleOffset is an option for cells that specifies the relative position of the next graphic to be used in an animation sequence.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AnimationCycleOffset
 * Documentation:    web: http://reference.wolfram.com/language/ref/AnimationCycleOffset.html
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
fun animationCycleOffset(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AnimationCycleOffset", arguments.toMutableList(), options)
}
