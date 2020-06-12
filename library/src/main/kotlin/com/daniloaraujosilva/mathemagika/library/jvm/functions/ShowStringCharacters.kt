package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ShowStringCharacters
 *
 * Full name:        System`ShowStringCharacters
 *
 * Usage:            ShowStringCharacters is an option for Cell that specifies whether to display " when a string is entered.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ShowStringCharacters
 * Documentation:    web: http://reference.wolfram.com/language/ref/ShowStringCharacters.html
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
fun showStringCharacters(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShowStringCharacters", arguments.toMutableList(), options)
}
