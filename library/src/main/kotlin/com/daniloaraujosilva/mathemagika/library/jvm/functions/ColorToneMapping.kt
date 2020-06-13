package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ColorToneMapping
 *
 * Full name:        System`ColorToneMapping
 *
 *                   ColorToneMapping[image] applies a tone mapping to color values in image so as to make variations of luminance visible even in small intervals of the dynamic range.
 *                   ColorToneMapping[image, c] maps colors by compressing the overall range of luminance values by a factor c.
 *                   ColorToneMapping[image, range] applies a mapping only to colors whose initial luminance lies in the specified range.
 *                   ColorToneMapping[image, {range, c}] takes the specified range of colors and compresses their overall luminance values by a factor c.
 *                   ColorToneMapping[image, {{range , c }, {range , c }, …}] uses different compression factors c  for different ranges range .
 *                                                  1   1         2   2                                           i                           i
 * Usage:            ColorToneMapping[image, spec, s] uses the color compensation factor s to correct for saturation distortion introduced during tone mapping.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ColorToneMapping
 * Documentation:    web: http://reference.wolfram.com/language/ref/ColorToneMapping.html
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
fun colorToneMapping(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ColorToneMapping", arguments.toMutableList(), options)
}
