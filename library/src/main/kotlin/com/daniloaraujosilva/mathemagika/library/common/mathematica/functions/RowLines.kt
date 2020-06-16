package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RowLines
 *
 * Full name:        System`RowLines
 *
 * Usage:            RowLines is an option for the low-level function GridBox that specifies whether lines should be drawn between adjacent rows.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RowLines
 * Documentation:    web: http://reference.wolfram.com/language/ref/RowLines.html
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
fun rowLines(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RowLines", arguments.toMutableList(), options)
}
