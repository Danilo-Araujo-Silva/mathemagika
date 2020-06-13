package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PreviousCell
 *
 * Full name:        System`PreviousCell
 *
 *                   PreviousCell[] returns the CellObject corresponding to the cell directly above the currently evaluating cell.
 *                   PreviousCell[cellobj] starts looking from the given cell.
 * Usage:            PreviousCell[NotebookSelection[nbobj]] starts looking from the topmost selected item.
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
 *                   local: paclet:ref/PreviousCell
 * Documentation:    web: http://reference.wolfram.com/language/ref/PreviousCell.html
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
fun previousCell(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PreviousCell", arguments.toMutableList(), options)
}
