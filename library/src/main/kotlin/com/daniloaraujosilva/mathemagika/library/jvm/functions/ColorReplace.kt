package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ColorReplace
 *
 * Full name:        System`ColorReplace
 *
 *                   ColorReplace[image, color] finds regions in image whose pixel values are similar to color and replaces them with transparent pixels.
 *                   ColorReplace[image, color  replacement] replaces all pixels with the specified replacement color.
 *                   ColorReplace[image, color  replacement, d] replaces all pixels whose values are within a distance d from color.
 *                   ColorReplace[image, {color   replacement , …}, {d , …}] does multiple color replacements.
 * Usage:                                      1              1        1
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ColorReplace
 * Documentation:    web: http://reference.wolfram.com/language/ref/ColorReplace.html
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
fun colorReplace(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ColorReplace", arguments.toMutableList(), options)
}
