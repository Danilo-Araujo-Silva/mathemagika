package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             HexadecimalCharacter
 *
 * Full name:        System`HexadecimalCharacter
 *
 * Usage:            HexadecimalCharacter represents a hexadecimal digit character 0–9, a–f, A–F in StringExpression.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HexadecimalCharacter
 * Documentation:    web: http://reference.wolfram.com/language/ref/HexadecimalCharacter.html
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
fun hexadecimalCharacter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HexadecimalCharacter", arguments.toMutableList(), options)
}
