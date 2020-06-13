package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CellGroup
 *
 * Full name:        System`CellGroup
 *
 *                   CellGroup[{cell , cell , …}] gives an open group of cells that can appear in a Wolfram System notebook.
 *                                  1      2
 *                   CellGroup[{cell , cell , …}, 1] gives a cell group in which only the first cell is open.
 *                                  1      2
 *                   CellGroup[{cell , cell , …}, -1] gives a cell group in which only the last cell is open.
 *                                  1      2
 *                   CellGroup[{cell , cell , …}, {i , i , …}] gives a cell group in which cells i , i , … are open.
 * Usage:                           1      2        1   2                                         1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CellGroup
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellGroup.html
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
fun cellGroup(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellGroup", arguments.toMutableList(), options)
}
