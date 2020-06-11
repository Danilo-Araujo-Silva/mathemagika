package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ToDate
 *
 * Full name:        System`ToDate
 *
 * Usage:            ToDate[time] converts an absolute time in seconds since the beginning of January 1, 1900 to a date of the form {y, m, d, h, m, s}.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ToDate
 * Documentation:    web: http://reference.wolfram.com/language/ref/ToDate.html
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
fun toDate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ToDate", arguments.toMutableList(), options)
}
