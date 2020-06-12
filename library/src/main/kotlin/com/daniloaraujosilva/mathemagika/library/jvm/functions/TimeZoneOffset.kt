package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TimeZoneOffset
 *
 * Full name:        System`TimeZoneOffset
 *
 *                   TimeZoneOffset[tz] gives the numeric offset between the time zone tz and GMT on the current date.
 *                   TimeZoneOffset[loc] gives the numeric offset between the time zone for the location loc and GMT.
 *                   TimeZoneOffset[tz, base] gives the numeric offset between tz and the specified base time zone.
 * Usage:            TimeZoneOffset[tz, base, date] gives the numeric offset between tz and base on the specified date.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TimeZoneOffset
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeZoneOffset.html
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
fun timeZoneOffset(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeZoneOffset", arguments.toMutableList(), options)
}
