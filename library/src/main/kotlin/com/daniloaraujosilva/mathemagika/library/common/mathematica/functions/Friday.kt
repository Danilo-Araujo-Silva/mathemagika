package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Friday
 *
 * Full name:        System`Friday
 *
 * Usage:            Friday is a day of the week.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Friday
 * Documentation:    web: http://reference.wolfram.com/language/ref/Friday.html
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
fun friday(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Friday", arguments.toMutableList(), options)
}
