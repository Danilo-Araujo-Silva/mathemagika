package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ImageMultiply
 *
 * Full name:        System`ImageMultiply
 *
 *                   ImageMultiply[image, x] multiplies each channel value in image by a factor x.
 *                   ImageMultiply[image , image ] gives an image in which each pixel is the product of the corresponding pixels in image  and image .
 *                                      1       2                                                                                        1          2
 *                   ImageMultiply[image, expr , expr , …] multiplies all expr  with image, where each expr  can be either an image, a number, or a color value.
 * Usage:                                     1      2                        i                            i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageMultiply
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageMultiply.html
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
fun imageMultiply(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageMultiply", arguments.toMutableList(), options)
}
