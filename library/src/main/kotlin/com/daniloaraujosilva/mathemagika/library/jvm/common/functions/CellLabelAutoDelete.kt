package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CellLabelAutoDelete
 *
 * Full name:        System`CellLabelAutoDelete
 *
 * Usage:            CellLabelAutoDelete is an option for Cell which specifies whether a label for the cell should be automatically deleted if the contents of the cell are modified or the notebook containing the cell is saved in a file.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CellLabelAutoDelete
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellLabelAutoDelete.html
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
fun cellLabelAutoDelete(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellLabelAutoDelete", arguments.toMutableList(), options)
}
