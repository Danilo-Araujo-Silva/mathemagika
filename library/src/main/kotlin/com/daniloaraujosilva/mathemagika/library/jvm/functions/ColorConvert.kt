package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ColorConvert
 *
 * Full name:        System`ColorConvert
 *
 * Usage:            ColorConvert[expr, colspace] converts color specifications in expr to refer to the color space represented by colspace.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ColorConvert
 * Documentation:    web: http://reference.wolfram.com/language/ref/ColorConvert.html
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
fun colorConvert(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ColorConvert", arguments.toMutableList(), options)
}
