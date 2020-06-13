package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ColorSeparate
 *
 * Full name:        System`ColorSeparate
 *
 *                   ColorSeparate[image] gives a list of single-channel images corresponding to each of the color channels in image.
 *                   ColorSeparate[image, colorspace] gives a list of images corresponding to the components of colorspace.
 * Usage:            ColorSeparate[image, channel] returns a single-channel image containing the specified channel.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ColorSeparate
 * Documentation:    web: http://reference.wolfram.com/language/ref/ColorSeparate.html
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
fun colorSeparate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ColorSeparate", arguments.toMutableList(), options)
}
