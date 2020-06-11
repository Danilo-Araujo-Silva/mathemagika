package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NotebookFileName
 *
 * Full name:        System`NotebookFileName
 *
 *                   NotebookFileName[] gives the file name of the current evaluation notebook.
 * Usage:            NotebookFileName[nb] gives the file name for the notebook specified by nb.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NotebookFileName
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotebookFileName.html
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
fun notebookFileName(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotebookFileName", arguments.toMutableList(), options)
}
