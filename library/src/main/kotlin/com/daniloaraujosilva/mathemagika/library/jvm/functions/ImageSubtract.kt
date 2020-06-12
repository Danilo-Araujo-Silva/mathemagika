package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImageSubtract
 *
 * Full name:        System`ImageSubtract
 *
 *                   ImageSubtract[image, x] subtracts a constant amount x from each channel value in image.
 *                   ImageSubtract[image , image ] gives an image in which each pixel is obtained by subtracting the values of the corresponding pixels in image  and image .
 *                                      1       2                                                                                                               1          2
 *                   ImageSubtract[image, expr , expr , …] subtracts all expr  from image, where each expr  can be either an image, a number, or a color value.
 * Usage:                                     1      2                       i                            i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageSubtract
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageSubtract.html
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
fun imageSubtract(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageSubtract", arguments.toMutableList(), options)
}
