package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TableDirections
 *
 * Full name:        System`TableDirections
 *
 * Usage:            TableDirections is an option for TableForm and MatrixForm which specifies whether successive dimensions should be arranged as rows or columns.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TableDirections
 * Documentation:    web: http://reference.wolfram.com/language/ref/TableDirections.html
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
fun tableDirections(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TableDirections", arguments.toMutableList(), options)
}
