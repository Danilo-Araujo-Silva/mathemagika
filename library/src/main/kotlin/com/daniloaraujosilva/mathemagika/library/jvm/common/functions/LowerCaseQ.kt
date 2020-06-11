package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LowerCaseQ
 *
 * Full name:        System`LowerCaseQ
 *
 * Usage:            LowerCaseQ[string] yields True if all the characters in the string are lowercase letters, and yields False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LowerCaseQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/LowerCaseQ.html
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
fun lowerCaseQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LowerCaseQ", arguments.toMutableList(), options)
}
