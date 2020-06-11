package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WordFrequency
 *
 * Full name:        System`WordFrequency
 *
 *                   WordFrequency[text, word] gives the frequency of word in text.
 *                   WordFrequency[text, {word , word , …}] gives an association of the frequencies of each of the word .
 * Usage:                                     1      2                                                                 i
 *
 * Options:          IgnoreCase -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WordFrequency
 * Documentation:    web: http://reference.wolfram.com/language/ref/WordFrequency.html
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
fun wordFrequency(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WordFrequency", arguments.toMutableList(), options)
}
