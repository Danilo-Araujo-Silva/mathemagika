package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Capitalize
 *
 * Full name:        System`Capitalize
 *
 *                   Capitalize[string] yields a string in which the first character has been made uppercase.
 * Usage:            Capitalize[string, scheme] gives a string capitalized using the specified capitalization scheme.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Capitalize
 * Documentation:    web: http://reference.wolfram.com/language/ref/Capitalize.html
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
fun capitalize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Capitalize", arguments.toMutableList(), options)
}
