package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CurrentDate
 *
 * Full name:        System`CurrentDate
 *
 *                   CurrentDate[gran] gives the current date of the specified granularity type gran.
 *                   CurrentDate[date, gran] gives the date of the given granularity that includes the specified date.
 * Usage:            CurrentDate[] gives the instant corresponding to the current date.
 *
 *                   CalendarType -> Automatic
 * Options:          TimeZone :> $TimeZone
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CurrentDate
 * Documentation:    web: http://reference.wolfram.com/language/ref/CurrentDate.html
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
fun currentDate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CurrentDate", arguments.toMutableList(), options)
}
