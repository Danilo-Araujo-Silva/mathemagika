package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ImageColorSpace
 *
 * Full name:        System`ImageColorSpace
 *
 * Usage:            ImageColorSpace[image] gives the name of the color space of image.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ImageColorSpace
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageColorSpace.html
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
fun imageColorSpace(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageColorSpace", arguments.toMutableList(), options)
}
