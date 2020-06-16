package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ListPickerBoxOptions
 *
 * Full name:        System`ListPickerBoxOptions
 *
 * Usage:            ListPickerBoxOptions is an option that specifies settings for ListPickerBox objects.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ListPickerBoxOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/ListPickerBoxOptions.html
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
fun listPickerBoxOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ListPickerBoxOptions", arguments.toMutableList(), options)
}
