package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NextDate
 *
 * Full name:        System`NextDate
 *
 *                   NextDate[gran] gives the next occurring date of the specified granularity type gran.
 *                   NextDate[daytype] gives the next day corresponding to the specified daytype.
 * Usage:            NextDate[date, gran] gives the next date of the given granularity relative to the specified date.
 *
 *                   CalendarType -> Automatic
 * Options:          TimeZone :> $TimeZone
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NextDate
 * Documentation:    web: http://reference.wolfram.com/language/ref/NextDate.html
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
fun nextDate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NextDate", arguments.toMutableList(), options)
}
