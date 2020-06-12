package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CellLabelMargins
 *
 * Full name:        System`CellLabelMargins
 *
 * Usage:            CellLabelMargins is an option for cells that specifies the absolute margins in printer's points around a cell label.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CellLabelMargins
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellLabelMargins.html
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
fun cellLabelMargins(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellLabelMargins", arguments.toMutableList(), options)
}
