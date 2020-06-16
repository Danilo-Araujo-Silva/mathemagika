package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RandomImage
 *
 * Full name:        System`RandomImage
 *
 *                   RandomImage[max] gives an image with pseudorandom pixel values in the range 0 to max.
 *                   RandomImage[{min, max}] generates pseudorandom pixel values in the range min to max.
 *                   RandomImage[dist] generates pixel values using a symbolic distribution dist.
 * Usage:            RandomImage[…, size] generates a random image of the specified size.
 *
 *                   ColorSpace -> Automatic
 *                   ImageSize -> Automatic
 * Options:          Magnification -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RandomImage
 * Documentation:    web: http://reference.wolfram.com/language/ref/RandomImage.html
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
fun randomImage(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RandomImage", arguments.toMutableList(), options)
}
