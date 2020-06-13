package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DigitCharacter
 *
 * Full name:        System`DigitCharacter
 *
 * Usage:            DigitCharacter represents a digit character 0–9 in StringExpression.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DigitCharacter
 * Documentation:    web: http://reference.wolfram.com/language/ref/DigitCharacter.html
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
fun digitCharacter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DigitCharacter", arguments.toMutableList(), options)
}
