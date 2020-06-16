package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageTransformation
 *
 * Full name:        System`ImageTransformation
 *
 *                   ImageTransformation[image, f] gives an image in which each pixel at position p corresponds to the position f[p] in image.
 * Usage:            ImageTransformation[image, f, size] gives an image of the specified size.
 *
 *                   Background -> 0
 *                   DataRange -> Automatic
 *                   Masking -> Full
 *                   Padding -> 0
 *                   PlotRange -> Automatic
 * Options:          Resampling -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageTransformation
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageTransformation.html
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
fun imageTransformation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageTransformation", arguments.toMutableList(), options)
}
