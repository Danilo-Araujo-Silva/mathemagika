package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ColumnAlignments
 *
 * Full name:        System`ColumnAlignments
 *
 * Usage:            ColumnAlignments is an option for the low-level function GridBox that specifies how entries in each column should be aligned.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ColumnAlignments
 * Documentation:    web: http://reference.wolfram.com/language/ref/ColumnAlignments.html
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
fun columnAlignments(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ColumnAlignments", arguments.toMutableList(), options)
}
