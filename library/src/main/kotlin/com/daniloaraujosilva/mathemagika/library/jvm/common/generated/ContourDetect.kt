package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ContourDetect
 * 
 * Full name:        System`ContourDetect
 * 
 *                   ContourDetect[image] gives a binary image in which white pixels correspond to the zeros and zero crossings in image.
 *                   ContourDetect[image, delta] treats values in image that are smaller in absolute value than delta as zero.
 * Usage:            ContourDetect[array, …] gives a binary sparse array in which 1 corresponds to zeros and zero crossings in array. 
 * 
 * Options:          CornerNeighbors -> True
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/ContourDetect
 * Documentation:    web: http://reference.wolfram.com/language/ref/ContourDetect.html
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
fun contourDetect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ContourDetect", arguments.toMutableList(), options)
}
