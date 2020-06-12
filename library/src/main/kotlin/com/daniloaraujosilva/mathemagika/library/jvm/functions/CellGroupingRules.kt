package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CellGroupingRules
 *
 * Full name:        System`CellGroupingRules
 *
 * Usage:            CellGroupingRules is an option for cells that specifies the rules used for grouping a cell.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CellGroupingRules
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellGroupingRules.html
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
fun cellGroupingRules(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellGroupingRules", arguments.toMutableList(), options)
}
