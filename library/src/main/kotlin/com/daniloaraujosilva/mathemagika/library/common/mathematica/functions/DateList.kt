package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DateList
 *
 * Full name:        System`DateList
 *
 *                   DateList[] gives the current local date and time in the form {year, month, day, hour, minute, second}.
 *                   DateList[time] gives a date list corresponding to an AbsoluteTime specification.
 *                   DateList[date] gives a date list corresponding to a DateObject specification.
 *                   DateList[{y, m, d, h, m, s}] converts a date list to standard normalized form.
 *                   DateList["string"] converts a date string to a date list.
 *                   DateList[{"string", {"e ", "e ", …}}] gives the date list obtained by extracting elements "e " from "string".
 * Usage:                                   1     2                                                              i
 *
 *                   DateDelimiters -> Automatic
 * Options:          TimeZone :> $TimeZone
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DateList
 * Documentation:    web: http://reference.wolfram.com/language/ref/DateList.html
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
fun dateList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DateList", arguments.toMutableList(), options)
}
