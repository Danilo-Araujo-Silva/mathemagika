package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ToLowerCase
 *
 * Full name:        System`ToLowerCase
 *
 * Usage:            ToLowerCase[string] yields a string in which all letters have been converted to lowercase.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ToLowerCase
 * Documentation:    web: http://reference.wolfram.com/language/ref/ToLowerCase.html
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
fun toLowerCase(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ToLowerCase", arguments.toMutableList(), options)
}
