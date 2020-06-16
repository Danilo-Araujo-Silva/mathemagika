package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NextCell
 *
 * Full name:        System`NextCell
 *
 *                   NextCell[] returns the CellObject corresponding to the cell directly below the currently evaluating cell.
 *                   NextCell[cellobj] starts looking from the given cell.
 * Usage:            NextCell[NotebookSelection[nbobj]] starts looking from the bottommost selected item.
 *
 *                   CellID -> Automatic
 *                   CellLabel -> Automatic
 *                   CellStyle -> Automatic
 *                   CellTags -> Automatic
 *                   CounterAssignments -> Automatic
 *                   CounterIncrements -> Automatic
 *                   Evaluator -> Automatic
 *                   ExpressionUUID -> Automatic
 * Options:          GeneratedCell -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NextCell
 * Documentation:    web: http://reference.wolfram.com/language/ref/NextCell.html
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
fun nextCell(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NextCell", arguments.toMutableList(), options)
}
