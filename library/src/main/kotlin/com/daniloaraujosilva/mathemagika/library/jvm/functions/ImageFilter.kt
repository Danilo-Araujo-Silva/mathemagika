package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ImageFilter
 *
 * Full name:        System`ImageFilter
 *
 * Usage:            ImageFilter[f, image, r] applies the function f to the range-r neighborhood of each pixel in each channel of image.
 *
 *                   Interleaving -> False
 *                   Masking -> All
 * Options:          Padding -> Fixed
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageFilter.html
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
fun imageFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageFilter", arguments.toMutableList(), options)
}
