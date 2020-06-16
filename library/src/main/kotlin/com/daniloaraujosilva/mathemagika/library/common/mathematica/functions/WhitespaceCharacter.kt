package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             WhitespaceCharacter
 *
 * Full name:        System`WhitespaceCharacter
 *
 * Usage:            WhitespaceCharacter represents a single whitespace character in StringExpression.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WhitespaceCharacter
 * Documentation:    web: http://reference.wolfram.com/language/ref/WhitespaceCharacter.html
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
fun whitespaceCharacter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WhitespaceCharacter", arguments.toMutableList(), options)
}
