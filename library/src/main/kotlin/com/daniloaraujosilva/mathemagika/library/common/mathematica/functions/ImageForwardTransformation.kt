package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageForwardTransformation
 *
 * Full name:        System`ImageForwardTransformation
 *
 *                   ImageForwardTransformation[image, f] gives an image in which each pixel at position f[{x, y}] corresponds to the position {x, y} in image.
 * Usage:            ImageForwardTransformation[image, f, size] gives an image of the specified size.
 *
 *                   Background -> 0
 *                   DataRange -> Automatic
 *                   Method -> Automatic
 * Options:          PlotRange -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ImageForwardTransformation
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageForwardTransformation.html
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
fun imageForwardTransformation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageForwardTransformation", arguments.toMutableList(), options)
}
