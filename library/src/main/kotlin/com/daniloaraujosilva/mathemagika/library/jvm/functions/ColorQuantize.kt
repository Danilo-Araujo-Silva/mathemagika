package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ColorQuantize
 *
 * Full name:        System`ColorQuantize
 *
 *                   ColorQuantize[image] gives an approximation to image by quantizing to distinct colors.
 *                   ColorQuantize[image, n] uses at most n distinct colors.
 *                   ColorQuantize[image, {col , …, col }] represents an image using only the n specified colors col .
 * Usage:                                     1        n                                                            i
 *
 *                   Dithering -> True
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ColorQuantize
 * Documentation:    web: http://reference.wolfram.com/language/ref/ColorQuantize.html
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
fun colorQuantize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ColorQuantize", arguments.toMutableList(), options)
}
