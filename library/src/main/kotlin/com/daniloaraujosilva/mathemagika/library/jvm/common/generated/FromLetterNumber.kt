package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FromLetterNumber
 * 
 * Full name:        System`FromLetterNumber
 * 
 *                   FromLetterNumber[n] gives the lowercase letter at position n in the English alphabet.
 * Usage:            FromLetterNumber[n, alpha] gives the letter at position n in the alphabet specified by alpha.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FromLetterNumber
 * Documentation:    web: http://reference.wolfram.com/language/ref/FromLetterNumber.html
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
fun fromLetterNumber(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FromLetterNumber", arguments.toMutableList(), options)
}
