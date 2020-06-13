package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AccuracyGoal
 *
 * Full name:        System`AccuracyGoal
 *
 * Usage:            AccuracyGoal is an option for various numerical operations which specifies how many effective digits of accuracy should be sought in the final result.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AccuracyGoal
 * Documentation:    web: http://reference.wolfram.com/language/ref/AccuracyGoal.html
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
fun accuracyGoal(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AccuracyGoal", arguments.toMutableList(), options)
}
