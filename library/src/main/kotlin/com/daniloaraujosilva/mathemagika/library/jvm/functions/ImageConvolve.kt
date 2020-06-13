package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ImageConvolve
 *
 * Full name:        System`ImageConvolve
 *
 * Usage:            ImageConvolve[image, ker] gives the convolution of image with kernel ker.
 *
 * Options:          Padding -> Fixed
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageConvolve
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageConvolve.html
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
fun imageConvolve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageConvolve", arguments.toMutableList(), options)
}
