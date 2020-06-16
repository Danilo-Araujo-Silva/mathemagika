package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NumberPoint
 *
 * Full name:        System`NumberPoint
 *
 * Usage:            NumberPoint is an option for NumberForm and related functions that gives the string to use as a decimal point.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NumberPoint
 * Documentation:    web: http://reference.wolfram.com/language/ref/NumberPoint.html
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
fun numberPoint(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NumberPoint", arguments.toMutableList(), options)
}
