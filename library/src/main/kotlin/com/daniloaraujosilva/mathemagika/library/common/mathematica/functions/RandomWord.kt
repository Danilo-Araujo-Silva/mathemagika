package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RandomWord
 *
 * Full name:        System`RandomWord
 *
 *                   RandomWord[] gives a pseudorandom commonly used word.
 *                   RandomWord[n] gives a list of n pseudorandom words.
 *                   RandomWord[type] gives a pseudorandom word of the specified type.
 * Usage:            RandomWord[type, n] gives a list of n pseudorandom words of the specified type.
 *
 *                   IncludeInflections -> False
 * Options:          Language :> $Language
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RandomWord
 * Documentation:    web: http://reference.wolfram.com/language/ref/RandomWord.html
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
fun randomWord(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RandomWord", arguments.toMutableList(), options)
}
