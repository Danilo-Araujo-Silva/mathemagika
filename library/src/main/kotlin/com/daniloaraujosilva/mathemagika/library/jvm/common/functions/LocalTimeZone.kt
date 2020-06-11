package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LocalTimeZone
 *
 * Full name:        System`LocalTimeZone
 *
 *                   LocalTimeZone[] gives the current time zone for the current geo location.
 *                   LocalTimeZone[loc] gives the current time zone for the geo location specified by loc.
 *                   LocalTimeZone[loc, date] gives the time zone for the geo location loc on the specified date.
 * Usage:            LocalTimeZone[loc, date, "prop"] gives the specified property of the time zone.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LocalTimeZone
 * Documentation:    web: http://reference.wolfram.com/language/ref/LocalTimeZone.html
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
fun localTimeZone(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LocalTimeZone", arguments.toMutableList(), options)
}
