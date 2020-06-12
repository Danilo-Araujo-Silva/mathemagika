package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NotebookCreate
 *
 * Full name:        System`NotebookCreate
 *
 *                   NotebookCreate[] creates a new open notebook in the front end.
 * Usage:            NotebookCreate[options] sets up the specified options for the new notebook.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NotebookCreate
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotebookCreate.html
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
fun notebookCreate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotebookCreate", arguments.toMutableList(), options)
}
