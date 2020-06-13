package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SelectedCells
 *
 * Full name:        System`SelectedCells
 *
 *                   SelectedCells[notebook] returns a list of CellObject expressions corresponding to the currently selected cells in notebook.
 * Usage:            SelectedCells[] returns the currently selected cells in the notebook in which this function is being evaluated.
 *
 * Options:          AllowInlineCells -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SelectedCells
 * Documentation:    web: http://reference.wolfram.com/language/ref/SelectedCells.html
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
fun selectedCells(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SelectedCells", arguments.toMutableList(), options)
}
