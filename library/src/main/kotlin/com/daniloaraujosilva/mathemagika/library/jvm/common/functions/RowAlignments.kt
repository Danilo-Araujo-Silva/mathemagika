package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RowAlignments
 *
 * Full name:        System`RowAlignments
 *
 * Usage:            RowAlignments is an option for the low-level function GridBox that specifies how entries in each row should be aligned.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RowAlignments
 * Documentation:    web: http://reference.wolfram.com/language/ref/RowAlignments.html
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
fun rowAlignments(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RowAlignments", arguments.toMutableList(), options)
}
