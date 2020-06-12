package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CellLabelPositioning
 *
 * Full name:        System`CellLabelPositioning
 *
 * Usage:            CellLabelPositioning is an option for cells that specifies where the label for a cell is positioned.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CellLabelPositioning
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellLabelPositioning.html
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
fun cellLabelPositioning(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellLabelPositioning", arguments.toMutableList(), options)
}
