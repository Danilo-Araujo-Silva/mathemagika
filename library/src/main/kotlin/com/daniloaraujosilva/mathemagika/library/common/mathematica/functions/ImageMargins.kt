package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageMargins
 *
 * Full name:        System`ImageMargins
 *
 * Usage:            ImageMargins is an option that specifies the absolute margins to leave around the image displayed for an object.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ImageMargins
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageMargins.html
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
fun imageMargins(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageMargins", arguments.toMutableList(), options)
}
