package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LineIndent
 *
 * Full name:        System`LineIndent
 *
 * Usage:            LineIndent is an option for Style and Cell that specifies how many ems of indentation to add at the beginnings of lines for each level of nesting in an expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LineIndent
 * Documentation:    web: http://reference.wolfram.com/language/ref/LineIndent.html
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
fun lineIndent(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LineIndent", arguments.toMutableList(), options)
}
