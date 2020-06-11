package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ShowShortBoxForm
 *
 * Full name:        System`ShowShortBoxForm
 *
 * Usage:            ShowShortBoxForm is an option for cells that specifies whether box expressions, which are used to represent two-dimensional forms in a cell, are displayed in a more compact notation when the expression for that cell is viewed.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ShowShortBoxForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/ShowShortBoxForm.html
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
fun showShortBoxForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShowShortBoxForm", arguments.toMutableList(), options)
}
