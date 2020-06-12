package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CellGrouping
 *
 * Full name:        System`CellGrouping
 *
 * Usage:            CellGrouping is a notebook option that specifies how cells in the notebook should be assembled into groups.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CellGrouping
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellGrouping.html
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
fun cellGrouping(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellGrouping", arguments.toMutableList(), options)
}
