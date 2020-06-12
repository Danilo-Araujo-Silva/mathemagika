package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ShowCellLabel
 *
 * Full name:        System`ShowCellLabel
 *
 * Usage:            ShowCellLabel is an option for Cell that specifies whether to display the label for a cell.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ShowCellLabel
 * Documentation:    web: http://reference.wolfram.com/language/ref/ShowCellLabel.html
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
fun showCellLabel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShowCellLabel", arguments.toMutableList(), options)
}
