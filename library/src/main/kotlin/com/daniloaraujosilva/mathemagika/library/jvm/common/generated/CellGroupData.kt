package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CellGroupData
 * 
 * Full name:        System`CellGroupData
 * 
 *                   CellGroupData[{cell , cell , …}] is a low-level construct that represents an open group of cells in a notebook. 
 *                                      1      2
 *                   CellGroupData[{cell , cell , …}, status] represents a cell group that is open or closed according to the value of status.
 *                                      1      2
 *                   CellGroupData[{cell , cell , …}, {i , i , …}] represents a cell group with cells at positions i , i , … open. 
 * Usage:                               1      2        1   2                                                       1   2
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/CellGroupData
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellGroupData.html
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
fun cellGroupData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellGroupData", arguments.toMutableList(), options)
}
