package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CellPrint
 *
 * Full name:        System`CellPrint
 *
 *                   CellPrint[expr] inserts expr as a complete cell in the current notebook just below the cell being evaluated.
 *                   CellPrint[{expr , expr , …}] inserts a sequence of cells.
 * Usage:                           1      2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CellPrint
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellPrint.html
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
fun cellPrint(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellPrint", arguments.toMutableList(), options)
}
