package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ScalingFunctions
 *
 * Full name:        System`ScalingFunctions
 *
 * Usage:            ScalingFunctions is an option for ListPlot, BarChart, Histogram, and other plotting functions that specifies what scaling functions should be used.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ScalingFunctions
 * Documentation:    web: http://reference.wolfram.com/language/ref/ScalingFunctions.html
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
fun scalingFunctions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ScalingFunctions", arguments.toMutableList(), options)
}
