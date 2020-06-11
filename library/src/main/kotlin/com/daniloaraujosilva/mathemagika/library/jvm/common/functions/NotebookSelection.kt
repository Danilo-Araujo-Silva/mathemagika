package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NotebookSelection
 *
 * Full name:        System`NotebookSelection
 *
 *                   NotebookSelection[] represents the current selection in the current evaluation notebook in the front end.
 * Usage:            NotebookSelection[nb] represents the current selection associated with the open notebook nb.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NotebookSelection
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotebookSelection.html
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
fun notebookSelection(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotebookSelection", arguments.toMutableList(), options)
}
