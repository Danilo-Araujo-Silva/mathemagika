package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NotebookWrite
 *
 * Full name:        System`NotebookWrite
 *
 *                   NotebookWrite[notebook, data] writes data into a notebook at the current selection, setting the current selection to be just after the data written.
 *                   NotebookWrite[obj, data] replaces the given cell or box object instead of the current selection.
 * Usage:            NotebookWrite[obj, data, sel] writes data into a notebook, setting the current selection to be as specified by sel.
 *
 * Options:          AutoScroll -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NotebookWrite
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotebookWrite.html
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
fun notebookWrite(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotebookWrite", arguments.toMutableList(), options)
}
