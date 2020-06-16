package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MedianDeviation
 *
 * Full name:        System`MedianDeviation
 *
 * Usage:            MedianDeviation[list] gives the median absolute deviation from the median of the elements in list.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MedianDeviation
 * Documentation:    web: http://reference.wolfram.com/language/ref/MedianDeviation.html
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
fun medianDeviation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MedianDeviation", arguments.toMutableList(), options)
}
