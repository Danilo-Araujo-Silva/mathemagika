package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TotalWidth
 *
 * Full name:        System`TotalWidth
 *
 * Usage:            TotalWidth is an option that can be set for output streams to specify the maximum total number of characters of text that should be printed for each output expression. Short forms of expressions are given if the number of characters needed to print the whole expression is too large.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TotalWidth
 * Documentation:    web: http://reference.wolfram.com/language/ref/TotalWidth.html
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
fun totalWidth(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TotalWidth", arguments.toMutableList(), options)
}
