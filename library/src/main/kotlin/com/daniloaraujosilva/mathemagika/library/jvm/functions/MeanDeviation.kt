package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MeanDeviation
 *
 * Full name:        System`MeanDeviation
 *
 * Usage:            MeanDeviation[list] gives the mean absolute deviation from the mean of the elements in list.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MeanDeviation
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeanDeviation.html
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
fun meanDeviation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeanDeviation", arguments.toMutableList(), options)
}
