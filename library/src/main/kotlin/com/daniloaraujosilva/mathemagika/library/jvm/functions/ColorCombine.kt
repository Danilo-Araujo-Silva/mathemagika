package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ColorCombine
 *
 * Full name:        System`ColorCombine
 *
 *                   ColorCombine[{image , image , …}] creates a multichannel image by combining the sequence of channels in the image .
 *                                      1       2                                                                                     i
 *                   ColorCombine[{image , image , …}, colorspace] combines images that represent the color components specified by colorspace.
 * Usage:                               1       2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ColorCombine
 * Documentation:    web: http://reference.wolfram.com/language/ref/ColorCombine.html
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
fun colorCombine(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ColorCombine", arguments.toMutableList(), options)
}
