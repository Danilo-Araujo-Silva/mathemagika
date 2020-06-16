package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RowsEqual
 *
 * Full name:        System`RowsEqual
 *
 * Usage:            RowsEqual is an option for the low-level function GridBox that specifies whether all rows in the grid should be assigned equal total height.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RowsEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/RowsEqual.html
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
fun rowsEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RowsEqual", arguments.toMutableList(), options)
}
