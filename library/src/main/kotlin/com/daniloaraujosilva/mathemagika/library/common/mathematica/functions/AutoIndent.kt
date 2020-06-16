package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AutoIndent
 *
 * Full name:        System`AutoIndent
 *
 * Usage:            AutoIndent is an option for Style and Cell that specifies what automatic indentation should be done at the beginning of a new line after an explicit return character has been entered.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AutoIndent
 * Documentation:    web: http://reference.wolfram.com/language/ref/AutoIndent.html
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
fun autoIndent(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AutoIndent", arguments.toMutableList(), options)
}
