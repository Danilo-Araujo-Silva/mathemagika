package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageRotated
 *
 * Full name:        System`ImageRotated
 *
 * Usage:            ImageRotated is an option for Export that specifies whether images should be rotated into landscape mode.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ImageRotated
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageRotated.html
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
fun imageRotated(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageRotated", arguments.toMutableList(), options)
}
