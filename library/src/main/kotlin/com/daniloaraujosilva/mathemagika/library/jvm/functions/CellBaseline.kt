package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CellBaseline
 *
 * Full name:        System`CellBaseline
 *
 * Usage:            CellBaseline is an option for Cell which specifies where the baseline of the cell should be assumed to be when it appears inside another cell.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CellBaseline
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellBaseline.html
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
fun cellBaseline(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellBaseline", arguments.toMutableList(), options)
}
