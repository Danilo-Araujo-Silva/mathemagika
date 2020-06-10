package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ImageAdd
 * 
 * Full name:        System`ImageAdd
 * 
 *                   ImageAdd[image, x] adds an amount x to each channel value in image.
 *                   ImageAdd[image , image ] gives an image in which each pixel is the sum of the corresponding pixels in image  and image .
 *                                 1       2                                                                                    1          2
 *                   ImageAdd[image, expr , expr , …] adds all expr  to image, where each expr  can be either an image, a number, or a color value.
 * Usage:                                1      2                  i                          i
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ImageAdd
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageAdd.html
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
fun imageAdd(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageAdd", arguments.toMutableList(), options)
}
