package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageApplyIndexed
 *
 * Full name:        System`ImageApplyIndexed
 *
 *                   ImageApplyIndexed[f, image] applies the function f to the list of channel values for each pixel in image, giving the row and column index of each pixel as a second argument to f.
 *                   ImageApplyIndexed[f, {image , image , …}] applies f to the sequence of corresponding pixel values taken from each image , giving the corresponding row and column index of pixels as the last argument to f.
 * Usage:                                       1       2                                                                                   i
 *
 *                   Interleaving -> True
 * Options:          Masking -> All
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageApplyIndexed
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageApplyIndexed.html
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
fun imageApplyIndexed(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageApplyIndexed", arguments.toMutableList(), options)
}
