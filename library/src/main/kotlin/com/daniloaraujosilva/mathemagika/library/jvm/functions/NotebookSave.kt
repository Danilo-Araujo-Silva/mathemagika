package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NotebookSave
 *
 * Full name:        System`NotebookSave
 *
 *                   NotebookSave[notebook] saves the current version of the specified notebook.
 *                   NotebookSave[notebook, "file"] saves the notebook in the specified file.
 * Usage:            NotebookSave[] saves the current version of the current evaluation notebook in a file.
 *
 * Options:          Interactive -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NotebookSave
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotebookSave.html
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
fun notebookSave(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotebookSave", arguments.toMutableList(), options)
}
