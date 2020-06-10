package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CellStyle
 * 
 * Full name:        System`CellStyle
 * 
 * Usage:            CellStyle is a setting for functions such as NotebookFind and Cells that specifies the name of a cell style to search for in a notebook.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/CellStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellStyle.html
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
fun cellStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellStyle", arguments.toMutableList(), options)
}
