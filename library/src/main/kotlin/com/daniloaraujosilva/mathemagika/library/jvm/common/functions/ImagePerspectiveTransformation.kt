package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImagePerspectiveTransformation
 *
 * Full name:        System`ImagePerspectiveTransformation
 *
 *                   ImagePerspectiveTransformation[image, m] applies a linear fractional transform specified by a matrix m to the positions of each pixel in image.
 *                   ImagePerspectiveTransformation[image, tf] uses the TransformationFunction given by tf.
 * Usage:            ImagePerspectiveTransformation[image, …, size] gives an image of the specified size.
 *
 *                   Background -> 0
 *                   DataRange -> Automatic
 *                   Masking -> Full
 *                   Padding -> 0
 *                   PlotRange -> Automatic
 * Options:          Resampling -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ImagePerspectiveTransformation
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImagePerspectiveTransformation.html
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
fun imagePerspectiveTransformation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImagePerspectiveTransformation", arguments.toMutableList(), options)
}
