package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ShowAutoSpellCheck
 *
 * Full name:        System`ShowAutoSpellCheck
 *
 * Usage:            ShowAutoSpellCheck is an option for Cell that specifies whether to highlight misspelled words.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ShowAutoSpellCheck
 * Documentation:    web: http://reference.wolfram.com/language/ref/ShowAutoSpellCheck.html
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
fun showAutoSpellCheck(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShowAutoSpellCheck", arguments.toMutableList(), options)
}
