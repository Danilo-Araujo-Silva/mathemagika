package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NotebookClose
 *
 * Full name:        System`NotebookClose
 *
 *                   NotebookClose[notebook] closes the notebook corresponding to the specified notebook object.
 * Usage:            NotebookClose[] closes the current evaluation notebook.
 *
 *                   ClosingEvent -> None
 * Options:          Interactive -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NotebookClose
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotebookClose.html
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
fun notebookClose(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotebookClose", arguments.toMutableList(), options)
}
