package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AnimationCycleRepetitions
 *
 * Full name:        System`AnimationCycleRepetitions
 *
 * Usage:            AnimationCycleRepetitions is an option for cells that specifies the number of times a given animation cycle should be repeated.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AnimationCycleRepetitions
 * Documentation:    web: http://reference.wolfram.com/language/ref/AnimationCycleRepetitions.html
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
fun animationCycleRepetitions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AnimationCycleRepetitions", arguments.toMutableList(), options)
}
