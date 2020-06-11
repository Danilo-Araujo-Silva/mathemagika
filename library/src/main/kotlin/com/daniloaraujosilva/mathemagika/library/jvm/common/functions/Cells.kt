package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Cells
 *
 * Full name:        System`Cells
 *
 *                   Cells[] returns a list of CellObject expressions corresponding to cells in the current notebook.
 *                   Cells[obj] returns the list of CellObject expressions in obj.
 * Usage:            Cells[NotebookSelection[notebook]] returns the list of CellObject expressions for currently selected cells.
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
 *                   local: paclet:ref/Cells
 * Documentation:    web: http://reference.wolfram.com/language/ref/Cells.html
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
fun cells(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Cells", arguments.toMutableList(), options)
}
