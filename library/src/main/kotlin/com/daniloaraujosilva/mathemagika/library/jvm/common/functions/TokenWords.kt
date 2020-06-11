package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TokenWords
 *
 * Full name:        System`TokenWords
 *
 * Usage:            TokenWords is an option for Read and related functions which gives a list of token words to be used to delimit words.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TokenWords
 * Documentation:    web: http://reference.wolfram.com/language/ref/TokenWords.html
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
fun tokenWords(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TokenWords", arguments.toMutableList(), options)
}
