package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ToUpperCase
 *
 * Full name:        System`ToUpperCase
 *
 * Usage:            ToUpperCase[string] yields a string in which all letters have been converted to uppercase.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ToUpperCase
 * Documentation:    web: http://reference.wolfram.com/language/ref/ToUpperCase.html
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
fun toUpperCase(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ToUpperCase", arguments.toMutableList(), options)
}
