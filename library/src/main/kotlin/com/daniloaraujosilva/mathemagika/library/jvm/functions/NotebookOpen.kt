package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NotebookOpen
 *
 * Full name:        System`NotebookOpen
 *
 *                   NotebookOpen["name"] opens an existing notebook with the specified name, returning the corresponding notebook object.
 *                   NotebookOpen["name", options] opens a notebook using the options given.
 * Usage:            NotebookOpen["http://url",…] opens a notebook from any accessible URL.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NotebookOpen
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotebookOpen.html
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
fun notebookOpen(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotebookOpen", arguments.toMutableList(), options)
}
