package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CellProlog
 *
 * Full name:        System`CellProlog
 *
 * Usage:            CellProlog is an option to Cell that gives an expression to evaluate before each ordinary evaluation of the contents of the cell.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CellProlog
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellProlog.html
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
fun cellProlog(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellProlog", arguments.toMutableList(), options)
}
