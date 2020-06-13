package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TextWords
 *
 * Full name:        System`TextWords
 *
 *                   TextWords["string"] gives a list of the runs of characters identified as words in string.
 * Usage:            TextWords["string", n] gives the first n words in string.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TextWords
 * Documentation:    web: http://reference.wolfram.com/language/ref/TextWords.html
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
fun textWords(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TextWords", arguments.toMutableList(), options)
}
