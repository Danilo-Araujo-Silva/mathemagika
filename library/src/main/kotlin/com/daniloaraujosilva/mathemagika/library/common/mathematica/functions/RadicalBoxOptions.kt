package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RadicalBoxOptions
 *
 * Full name:        System`RadicalBoxOptions
 *
 * Usage:            RadicalBoxOptions is an option for selections that specifies settings for RadicalBox objects.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RadicalBoxOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/RadicalBoxOptions.html
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
fun radicalBoxOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RadicalBoxOptions", arguments.toMutableList(), options)
}
