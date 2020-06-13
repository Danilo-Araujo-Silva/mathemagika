package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Format
 *
 * Full name:        System`Format
 *
 *                   Format[expr] prints as the formatted form of expr. Assigning values to Format[expr] defines print forms for expressions.
 * Usage:            Format[expr, form] gives a format for the specified form of output.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Format
 * Documentation:    web: http://reference.wolfram.com/language/ref/Format.html
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
fun format(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Format", arguments.toMutableList(), options)
}
