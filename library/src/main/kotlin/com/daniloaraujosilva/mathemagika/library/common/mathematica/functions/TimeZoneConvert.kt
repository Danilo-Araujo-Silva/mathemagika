package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TimeZoneConvert
 *
 * Full name:        System`TimeZoneConvert
 *
 *                   TimeZoneConvert[time, timezone] converts the date or time object time to the specified time zone timezone.
 *                   TimeZoneConvert[time] converts to the current $TimeZone value.
 *                   TimeZoneConvert[{time , …, time }, timezone] converts time  through time  to the specified timezone.
 * Usage:                                 1         n                          1             n
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TimeZoneConvert
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeZoneConvert.html
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
fun timeZoneConvert(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeZoneConvert", arguments.toMutableList(), options)
}
