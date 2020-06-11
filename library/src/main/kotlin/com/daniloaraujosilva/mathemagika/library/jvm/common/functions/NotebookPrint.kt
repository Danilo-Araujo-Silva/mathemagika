package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NotebookPrint
 *
 * Full name:        System`NotebookPrint
 *
 *                   NotebookPrint[expr] sends a notebook containing expr to your default printer.
 *                   NotebookPrint[notebook] sends the specified notebook to your default printer.
 *                   NotebookPrint[notebook, "file.ext"] saves a print‐ready form of the notebook to a file in the format indicated by the file extension ext.
 * Usage:            NotebookPrint[] sends the current evaluation notebook to your default printer.
 *
 * Options:          Interactive -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NotebookPrint
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotebookPrint.html
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
fun notebookPrint(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotebookPrint", arguments.toMutableList(), options)
}
