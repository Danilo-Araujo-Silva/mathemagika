package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImageDifference
 *
 * Full name:        System`ImageDifference
 *
 *                   ImageDifference[image , image ] gives an image in which each pixel is the absolute difference of the corresponding pixels in image  and image .
 * Usage:                                 1       2                                                                                                    1          2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageDifference
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageDifference.html
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
fun imageDifference(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageDifference", arguments.toMutableList(), options)
}
