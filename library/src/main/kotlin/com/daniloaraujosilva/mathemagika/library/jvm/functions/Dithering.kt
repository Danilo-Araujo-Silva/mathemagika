package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Dithering
 *
 * Full name:        System`Dithering
 *
 * Usage:            Dithering is an option for ColorQuantize that specifies whether or not to apply dithering while quantizing the pixel values.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Dithering
 * Documentation:    web: http://reference.wolfram.com/language/ref/Dithering.html
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
fun dithering(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Dithering", arguments.toMutableList(), options)
}
