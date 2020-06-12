package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FontSlant
 *
 * Full name:        System`FontSlant
 *
 * Usage:            FontSlant is an option for Style, Cell, and related constructs that specifies how slanted characters in text should be.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FontSlant
 * Documentation:    web: http://reference.wolfram.com/language/ref/FontSlant.html
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
fun fontSlant(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FontSlant", arguments.toMutableList(), options)
}
