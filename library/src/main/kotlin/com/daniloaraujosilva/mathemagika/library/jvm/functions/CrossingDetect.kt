package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CrossingDetect
 *
 * Full name:        System`CrossingDetect
 *
 *                   CrossingDetect[image] gives a binary image in which white pixels correspond to the zero crossings in image.
 *                   CrossingDetect[image, delta] treats values in image that are smaller in absolute value than delta as zero.
 * Usage:            CrossingDetect[array, …] gives a binary sparse array in which 1 corresponds to zero crossings in array.
 *
 * Options:          CornerNeighbors -> True
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CrossingDetect
 * Documentation:    web: http://reference.wolfram.com/language/ref/CrossingDetect.html
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
fun crossingDetect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CrossingDetect", arguments.toMutableList(), options)
}
