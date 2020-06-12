package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImageRotate
 *
 * Full name:        System`ImageRotate
 *
 *                   ImageRotate[image] rotates image by 90° about its center in the x-y plane.
 *                   ImageRotate[image, θ] rotates image by θ radians.
 *                   ImageRotate[image, {θ, w}] rotates a 3D image around the 3D vector w.
 * Usage:            ImageRotate[image, …, size] gives an image of the specified size.
 *
 *                   Background -> 0
 *                   Masking -> All
 *                   Padding -> Fixed
 * Options:          Resampling -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ImageRotate
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageRotate.html
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
fun imageRotate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageRotate", arguments.toMutableList(), options)
}
