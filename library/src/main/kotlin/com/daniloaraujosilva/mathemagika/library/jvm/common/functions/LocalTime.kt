package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LocalTime
 *
 * Full name:        System`LocalTime
 *
 *                   LocalTime[] gives a DateObject corresponding to the current local time at the current geo location.
 *                   LocalTime[loc] gives the current local time at the geo location specified by loc.
 *                   LocalTime[loc, time] gives the local time corresponding to the date object time at the geo location loc.
 * Usage:            LocalTime[loc, time, func] uses func to determine what to return for extended geographic regions.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LocalTime
 * Documentation:    web: http://reference.wolfram.com/language/ref/LocalTime.html
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
fun localTime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LocalTime", arguments.toMutableList(), options)
}
