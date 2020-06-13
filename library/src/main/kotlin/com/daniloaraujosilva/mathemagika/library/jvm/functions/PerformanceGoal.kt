package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PerformanceGoal
 *
 * Full name:        System`PerformanceGoal
 *
 * Usage:            PerformanceGoal is an option for various algorithmic and presentational functions that specifies what aspect of performance to try to optimize with Automatic settings for options.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PerformanceGoal
 * Documentation:    web: http://reference.wolfram.com/language/ref/PerformanceGoal.html
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
fun performanceGoal(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PerformanceGoal", arguments.toMutableList(), options)
}
