package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NotebookApply
 *
 * Full name:        System`NotebookApply
 *
 *                   NotebookApply[notebook, data] writes data into a notebook at the current selection, replacing the first selection placeholder in data by the current selection, and then setting the current selection to be just after the data written.
 *                   NotebookApply[cell, data] writes data into a notebook in place of the specified cell.
 * Usage:            NotebookApply[notebook, data, sel] writes data into a notebook and then sets the current selection to be as specified by sel.
 *
 * Options:          AutoScroll -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NotebookApply
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotebookApply.html
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
fun notebookApply(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotebookApply", arguments.toMutableList(), options)
}
