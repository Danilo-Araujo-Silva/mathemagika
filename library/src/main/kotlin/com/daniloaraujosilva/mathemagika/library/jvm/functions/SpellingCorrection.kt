package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SpellingCorrection
 *
 * Full name:        System`SpellingCorrection
 *
 * Usage:            SpellingCorrection is an option for StringMatchQ, Names, and related functions that specifies whether strings should be considered to match even when a small fraction of the characters in them are different.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SpellingCorrection
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpellingCorrection.html
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
fun spellingCorrection(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpellingCorrection", arguments.toMutableList(), options)
}
