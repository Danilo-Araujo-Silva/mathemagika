package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TableAlignments
 *
 * Full name:        System`TableAlignments
 *
 * Usage:            TableAlignments is an option for TableForm and MatrixForm which specifies how entries in each dimension should be aligned.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TableAlignments
 * Documentation:    web: http://reference.wolfram.com/language/ref/TableAlignments.html
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
fun tableAlignments(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TableAlignments", arguments.toMutableList(), options)
}
