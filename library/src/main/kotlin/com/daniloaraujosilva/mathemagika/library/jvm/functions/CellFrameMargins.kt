package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CellFrameMargins
 *
 * Full name:        System`CellFrameMargins
 *
 * Usage:            CellFrameMargins is an option for Cell that specifies the absolute margins in printer’s points to leave inside a frame that is drawn around a cell.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CellFrameMargins
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellFrameMargins.html
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
fun cellFrameMargins(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellFrameMargins", arguments.toMutableList(), options)
}
