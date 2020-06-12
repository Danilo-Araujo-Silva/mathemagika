package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AbsoluteTime
 *
 * Full name:        System`AbsoluteTime
 *
 *                   AbsoluteTime[] gives the total number of seconds since the beginning of January 1, 1900, in your time zone.
 *                   AbsoluteTime[{y, m, d, h, m, s}] gives the absolute time specification corresponding to a date list.
 *                   AbsoluteTime[date] gives the absolute time specification corresponding to a DateObject.
 *                   AbsoluteTime["string"] gives the absolute time specification corresponding to a date string.
 *                   AbsoluteTime[{"string", {"e ", "e ", …}}] takes the date string to contain the elements "e ".
 * Usage:                                       1     2                                                        i
 *
 *                   DateDelimiters -> Automatic
 * Options:          TimeZone :> $TimeZone
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AbsoluteTime
 * Documentation:    web: http://reference.wolfram.com/language/ref/AbsoluteTime.html
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
fun absoluteTime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AbsoluteTime", arguments.toMutableList(), options)
}
