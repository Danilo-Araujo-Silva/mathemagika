package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FormBoxOptions
 *
 * Full name:        System`FormBoxOptions
 *
 * Usage:            FormBoxOptions is an option for cells that specifies settings for FormBox objects within the cell.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FormBoxOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/FormBoxOptions.html
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
fun formBoxOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FormBoxOptions", arguments.toMutableList(), options)
}
