package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CellEpilog
 *
 * Full name:        System`CellEpilog
 *
 * Usage:            CellEpilog is an option for Cell which gives an expression to evaluate after each ordinary evaluation of the contents of the cell.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CellEpilog
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellEpilog.html
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
fun cellEpilog(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellEpilog", arguments.toMutableList(), options)
}
