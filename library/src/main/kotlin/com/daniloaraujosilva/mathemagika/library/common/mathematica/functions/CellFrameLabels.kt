package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CellFrameLabels
 *
 * Full name:        System`CellFrameLabels
 *
 * Usage:            CellFrameLabels is an option that specifies the labels associated with the frame around a cell.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CellFrameLabels
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellFrameLabels.html
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
fun cellFrameLabels(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellFrameLabels", arguments.toMutableList(), options)
}
