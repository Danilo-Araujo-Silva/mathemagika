package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ShowCellBracket
 *
 * Full name:        System`ShowCellBracket
 *
 * Usage:            ShowCellBracket is an option for Cell that specifies whether to display the bracket that indicates the extent of the cell.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ShowCellBracket
 * Documentation:    web: http://reference.wolfram.com/language/ref/ShowCellBracket.html
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
fun showCellBracket(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShowCellBracket", arguments.toMutableList(), options)
}
