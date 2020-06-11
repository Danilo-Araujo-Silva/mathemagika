package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SelectionEvaluate
 *
 * Full name:        System`SelectionEvaluate
 *
 *                   SelectionEvaluate[notebook] replaces the current selection in a notebook with the result obtained by evaluating the contents of the selection in the kernel.
 * Usage:            SelectionEvaluate[notebook, sel] sets the current selection after the evaluation to be as specified by sel.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SelectionEvaluate
 * Documentation:    web: http://reference.wolfram.com/language/ref/SelectionEvaluate.html
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
fun selectionEvaluate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SelectionEvaluate", arguments.toMutableList(), options)
}
