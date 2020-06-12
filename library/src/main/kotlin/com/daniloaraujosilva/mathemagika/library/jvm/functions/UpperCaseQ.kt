package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UpperCaseQ
 *
 * Full name:        System`UpperCaseQ
 *
 * Usage:            UpperCaseQ[string] yields True if all the characters in the string are uppercase letters, and yields False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/UpperCaseQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/UpperCaseQ.html
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
fun upperCaseQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UpperCaseQ", arguments.toMutableList(), options)
}
