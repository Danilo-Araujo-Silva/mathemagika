package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ShowClosedCellArea
 *
 * Full name:        System`ShowClosedCellArea
 *
 * Usage:            ShowClosedCellArea is an option for cells that specifies whether a rectangular bar is displayed next to a closed cell group to indicate the number of cells in the group.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ShowClosedCellArea
 * Documentation:    web: http://reference.wolfram.com/language/ref/ShowClosedCellArea.html
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
fun showClosedCellArea(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShowClosedCellArea", arguments.toMutableList(), options)
}
