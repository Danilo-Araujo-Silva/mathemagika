package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FontVariations
 *
 * Full name:        System`FontVariations
 *
 * Usage:            FontVariations is an option for Style, Cell, and related constructs that specifies what font variations should be used.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FontVariations
 * Documentation:    web: http://reference.wolfram.com/language/ref/FontVariations.html
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
fun fontVariations(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FontVariations", arguments.toMutableList(), options)
}
