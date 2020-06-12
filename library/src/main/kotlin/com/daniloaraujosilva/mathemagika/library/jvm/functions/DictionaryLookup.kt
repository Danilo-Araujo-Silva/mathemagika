package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DictionaryLookup
 *
 * Full name:        System`DictionaryLookup
 *
 *                   DictionaryLookup[patt] finds all words in an English dictionary that match the string pattern patt.
 *                   DictionaryLookup[patt, n] gives only the first n words found.
 * Usage:            DictionaryLookup[{"lang", patt}] finds words in the language specified by lang.
 *
 * Options:          IgnoreCase -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DictionaryLookup
 * Documentation:    web: http://reference.wolfram.com/language/ref/DictionaryLookup.html
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
fun dictionaryLookup(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DictionaryLookup", arguments.toMutableList(), options)
}
