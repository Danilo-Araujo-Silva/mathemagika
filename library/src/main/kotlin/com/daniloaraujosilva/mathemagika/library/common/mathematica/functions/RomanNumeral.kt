package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RomanNumeral
 *
 * Full name:        System`RomanNumeral
 *
 * Usage:            RomanNumeral[n] gives a string corresponding to the Roman numeral form of the integer n.
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RomanNumeral
 * Documentation:    web: http://reference.wolfram.com/language/ref/RomanNumeral.html
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
fun romanNumeral(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RomanNumeral", arguments.toMutableList(), options)
}
