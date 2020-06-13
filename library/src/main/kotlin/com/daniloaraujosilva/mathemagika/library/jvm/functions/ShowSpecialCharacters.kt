package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ShowSpecialCharacters
 *
 * Full name:        System`ShowSpecialCharacters
 *
 * Usage:            ShowSpecialCharacters is an option for Style and Cell that specifies whether to replace \[Name], \:nnnn, etc. by explicit special characters.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ShowSpecialCharacters
 * Documentation:    web: http://reference.wolfram.com/language/ref/ShowSpecialCharacters.html
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
fun showSpecialCharacters(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShowSpecialCharacters", arguments.toMutableList(), options)
}
