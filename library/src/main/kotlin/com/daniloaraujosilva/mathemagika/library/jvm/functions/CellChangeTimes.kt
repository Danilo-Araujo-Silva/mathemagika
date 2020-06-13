package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CellChangeTimes
 *
 * Full name:        System`CellChangeTimes
 *
 * Usage:            CellChangeTimes is an option to Cell that specifies when changes were made to the cell.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CellChangeTimes
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellChangeTimes.html
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
fun cellChangeTimes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellChangeTimes", arguments.toMutableList(), options)
}
