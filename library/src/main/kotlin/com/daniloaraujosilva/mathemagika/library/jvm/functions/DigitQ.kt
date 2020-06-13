package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DigitQ
 *
 * Full name:        System`DigitQ
 *
 * Usage:            DigitQ[string] yields True if all the characters in the string are digits in the range 0 through 9, and yields False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DigitQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/DigitQ.html
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
fun digitQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DigitQ", arguments.toMutableList(), options)
}
