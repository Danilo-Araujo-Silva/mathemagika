package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NotebookGet
 *
 * Full name:        System`NotebookGet
 *
 *                   NotebookGet[obj] gets the raw expression corresponding to the notebook represented by the notebook object obj.
 * Usage:            NotebookGet[] gets the raw expression corresponding to the currently selected notebook.
 *
 * Options:          CellContext -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NotebookGet
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotebookGet.html
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
fun notebookGet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotebookGet", arguments.toMutableList(), options)
}
