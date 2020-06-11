package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SelectionCreateCell
 *
 * Full name:        System`SelectionCreateCell
 *
 *                   SelectionCreateCell[notebook] copies the contents of the current selection in a notebook into a new cell.
 * Usage:            SelectionCreateCell[notebook, sel] sets the current selection after the copy to be as specified by sel.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SelectionCreateCell
 * Documentation:    web: http://reference.wolfram.com/language/ref/SelectionCreateCell.html
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
fun selectionCreateCell(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SelectionCreateCell", arguments.toMutableList(), options)
}
