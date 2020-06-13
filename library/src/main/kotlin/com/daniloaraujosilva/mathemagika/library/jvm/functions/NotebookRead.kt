package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NotebookRead
 *
 * Full name:        System`NotebookRead
 *
 *                   NotebookRead[notebook] gives the expression corresponding to the current selection in the specified notebook object.
 *                   NotebookRead[obj] gives the expression corresponding to the given cell or box object.
 *                   NotebookRead[{obj , obj , …}] gives a list of expressions corresponding to the obj .
 * Usage:                             1     2                                                          i
 *
 * Options:          CellContext -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NotebookRead
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotebookRead.html
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
fun notebookRead(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotebookRead", arguments.toMutableList(), options)
}
