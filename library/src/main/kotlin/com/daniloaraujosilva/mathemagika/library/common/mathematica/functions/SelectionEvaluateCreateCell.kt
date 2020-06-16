package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SelectionEvaluateCreateCell
 *
 * Full name:        System`SelectionEvaluateCreateCell
 *
 *                   SelectionEvaluateCreateCell[notebook] takes the current selection in a notebook and creates a new cell containing the result obtained by evaluating the contents of the selection using the kernel.
 * Usage:            SelectionEvaluateCreateCell[notebook, sel] sets the current selection after the evaluation to be as specified by sel.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SelectionEvaluateCreateCell
 * Documentation:    web: http://reference.wolfram.com/language/ref/SelectionEvaluateCreateCell.html
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
fun selectionEvaluateCreateCell(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SelectionEvaluateCreateCell", arguments.toMutableList(), options)
}
