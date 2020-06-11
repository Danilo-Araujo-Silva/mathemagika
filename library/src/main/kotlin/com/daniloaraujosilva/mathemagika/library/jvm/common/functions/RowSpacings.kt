package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RowSpacings
 *
 * Full name:        System`RowSpacings
 *
 * Usage:            RowSpacings is an option for the low-level function GridBox that specifies the spaces in x heights that should be inserted between successive rows.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RowSpacings
 * Documentation:    web: http://reference.wolfram.com/language/ref/RowSpacings.html
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
fun rowSpacings(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RowSpacings", arguments.toMutableList(), options)
}
