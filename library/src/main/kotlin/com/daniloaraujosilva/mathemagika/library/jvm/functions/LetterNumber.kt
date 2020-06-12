package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LetterNumber
 *
 * Full name:        System`LetterNumber
 *
 *                   LetterNumber["c"] gives the position of the character c in the English alphabet.
 *                   LetterNumber["c", alpha] gives the position of c in the alphabet specified by alpha.
 * Usage:            LetterNumber["string", …] gives a list of the positions of characters in string.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LetterNumber
 * Documentation:    web: http://reference.wolfram.com/language/ref/LetterNumber.html
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
fun letterNumber(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LetterNumber", arguments.toMutableList(), options)
}
