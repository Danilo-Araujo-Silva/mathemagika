package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageAccumulate
 *
 * Full name:        System`ImageAccumulate
 *
 * Usage:            ImageAccumulate[image] gives an image in which each pixel represents a sum of all pixels below and to the left of that pixel in image.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageAccumulate
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageAccumulate.html
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
fun imageAccumulate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageAccumulate", arguments.toMutableList(), options)
}
