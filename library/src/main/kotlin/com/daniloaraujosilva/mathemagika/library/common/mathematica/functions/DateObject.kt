package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DateObject
 *
 * Full name:        System`DateObject
 *
 *                   DateObject[] gives the current local date.
 *                   DateObject[{y, m, d, h, m, s}] gives a date object of standard normalized form.
 *                   DateObject["string"] converts a date string to a date object.
 *                   DateObject[{"string", {e , e , …}}] gives the date object obtained by extracting elements "e " from "string".
 *                                           1   2                                                               i
 * Usage:            DateObject[rdate, gran] gives the date object of calendar granularity gran that includes the reference date rdate.
 *
 *                   CalendarType -> Automatic
 *                   DateFormat -> Automatic
 * Options:          TimeZone -> Automatic
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DateObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/DateObject.html
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
fun dateObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DateObject", arguments.toMutableList(), options)
}
