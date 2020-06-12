package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FromRomanNumeral
 *
 * Full name:        System`FromRomanNumeral
 *
 * Usage:            FromRomanNumeral["string"] gives the integer corresponding to the Roman numeral "string".
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FromRomanNumeral
 * Documentation:    web: http://reference.wolfram.com/language/ref/FromRomanNumeral.html
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
fun fromRomanNumeral(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FromRomanNumeral", arguments.toMutableList(), options)
}
