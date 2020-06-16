package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BaselinePosition
 *
 * Full name:        System`BaselinePosition
 *
 * Usage:            BaselinePosition is an option that specifies where the baseline of an object is considered to be for purposes of alignment with surrounding text or other expressions.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BaselinePosition
 * Documentation:    web: http://reference.wolfram.com/language/ref/BaselinePosition.html
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
fun baselinePosition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BaselinePosition", arguments.toMutableList(), options)
}
