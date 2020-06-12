package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImageApply
 *
 * Full name:        System`ImageApply
 *
 *                   ImageApply[f, image] applies the function f to the list of channel values for each pixel in image.
 *                   ImageApply[f, {image , image , …}] applies f to the sequence of corresponding pixel values taken from each image .
 * Usage:                                1       2                                                                                   i
 *
 *                   Interleaving -> True
 * Options:          Masking -> All
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageApply
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageApply.html
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
fun imageApply(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageApply", arguments.toMutableList(), options)
}
