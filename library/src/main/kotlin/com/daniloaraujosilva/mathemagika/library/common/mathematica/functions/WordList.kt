package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             WordList
 *
 * Full name:        System`WordList
 *
 *                   WordList[] gives a list of common words.
 * Usage:            WordList[type] gives a list of words of the specified type.
 *
 *                   IncludeInflections -> False
 * Options:          Language :> $Language
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WordList
 * Documentation:    web: http://reference.wolfram.com/language/ref/WordList.html
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
fun wordList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WordList", arguments.toMutableList(), options)
}
