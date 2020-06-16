package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DelimiterFlashTime
 *
 * Full name:        System`DelimiterFlashTime
 *
 * Usage:            DelimiterFlashTime is an option for cells and notebooks that specifies how long in seconds a delimiter should flash when its matching delimiter is entered.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DelimiterFlashTime
 * Documentation:    web: http://reference.wolfram.com/language/ref/DelimiterFlashTime.html
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
fun delimiterFlashTime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DelimiterFlashTime", arguments.toMutableList(), options)
}
