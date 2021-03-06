package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PreviousDate
 *
 * Full name:        System`PreviousDate
 *
 *                   PreviousDate[gran] gives the previously occurring date of the specified granularity type gran.
 *                   PreviousDate[daytype] gives the previous day corresponding to the specified daytype.
 * Usage:            PreviousDate[date, gran] gives the previous date of the given granularity relative to the specified date.
 *
 *                   CalendarType -> Automatic
 * Options:          TimeZone :> $TimeZone
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PreviousDate
 * Documentation:    web: http://reference.wolfram.com/language/ref/PreviousDate.html
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
fun previousDate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PreviousDate", arguments.toMutableList(), options)
}
