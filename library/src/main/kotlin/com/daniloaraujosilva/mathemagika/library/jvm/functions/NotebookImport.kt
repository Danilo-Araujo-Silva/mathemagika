package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NotebookImport
 *
 * Full name:        System`NotebookImport
 *
 *                   NotebookImport[notebook, style] imports cells with the given cell style from the specified notebook.
 * Usage:            NotebookImport[notebook, style  form] imports cells in the form specified by form.
 *
 *                   FlattenCellGroups -> True
 * Options:          StyleImportRules -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NotebookImport
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotebookImport.html
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
fun notebookImport(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotebookImport", arguments.toMutableList(), options)
}
