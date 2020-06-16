package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RowMinHeight
 *
 * Full name:        System`RowMinHeight
 *
 * Usage:            RowMinHeight is an option for the low-level function GridBox that specifies the minimum total height in units of font size that should be allowed for each row.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RowMinHeight
 * Documentation:    web: http://reference.wolfram.com/language/ref/RowMinHeight.html
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
fun rowMinHeight(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RowMinHeight", arguments.toMutableList(), options)
}
