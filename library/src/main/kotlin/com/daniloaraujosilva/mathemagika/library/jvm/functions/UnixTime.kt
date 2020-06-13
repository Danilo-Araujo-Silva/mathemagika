package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             UnixTime
 *
 * Full name:        System`UnixTime
 *
 *                   UnixTime[] gives the total number of seconds since the beginning of January 1, 1970, in the GMT time zone.
 *                   UnixTime[{y, m, d, h, m, s}] gives the Unix time specification corresponding to a date list.
 *                   UnixTime[date] gives the Unix time specification corresponding to a DateObject.
 *                   UnixTime["string"] gives the Unix time specification corresponding to a date string.
 *                   UnixTime[{"string", {e , e , …}}] takes the date string to contain the elements "e ".
 * Usage:                                  1   2                                                       i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/UnixTime
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnixTime.html
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
fun unixTime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnixTime", arguments.toMutableList(), options)
}
