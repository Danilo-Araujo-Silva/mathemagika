package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ImageClip
 *
 * Full name:        System`ImageClip
 *
 *                   ImageClip[image] clips all channel values in image to lie in the default range.
 *                   ImageClip[image, {min, max}] clips channel values to lie in the range from min to max.
 *                   ImageClip[image, {min, max}, {v   , v   }] gives v    for values below min and v    for values above max.
 * Usage:                                           min   max          min                           max
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageClip
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageClip.html
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
fun imageClip(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageClip", arguments.toMutableList(), options)
}
