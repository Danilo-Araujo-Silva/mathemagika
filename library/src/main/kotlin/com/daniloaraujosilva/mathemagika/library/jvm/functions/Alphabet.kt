package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Alphabet
 *
 * Full name:        System`Alphabet
 *
 *                   Alphabet[] gives a list of the lowercase letters a through z in the English alphabet.
 *                   Alphabet[type] gives the alphabet for the language or class type.
 * Usage:            Alphabet[type, prop] gives the alphabet defined by prop for the language or class type .
 *
 * Options:          Language :> English
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Alphabet
 * Documentation:    web: http://reference.wolfram.com/language/ref/Alphabet.html
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
fun alphabet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Alphabet", arguments.toMutableList(), options)
}
