package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FromDate
 *
 * Full name:        System`FromDate
 *
 * Usage:            FromDate[date] converts a date of the form {y, m, d, h, m, s} to an absolute number of seconds since the beginning of January 1, 1900.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FromDate
 * Documentation:    web: http://reference.wolfram.com/language/ref/FromDate.html
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
fun fromDate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FromDate", arguments.toMutableList(), options)
}
