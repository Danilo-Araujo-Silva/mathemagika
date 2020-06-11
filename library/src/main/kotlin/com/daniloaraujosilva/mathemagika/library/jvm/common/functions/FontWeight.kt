package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FontWeight
 *
 * Full name:        System`FontWeight
 *
 * Usage:            FontWeight is an option for Style, Cell, and related constructs that specifies how heavy the characters in a font should be.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FontWeight
 * Documentation:    web: http://reference.wolfram.com/language/ref/FontWeight.html
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
fun fontWeight(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FontWeight", arguments.toMutableList(), options)
}
