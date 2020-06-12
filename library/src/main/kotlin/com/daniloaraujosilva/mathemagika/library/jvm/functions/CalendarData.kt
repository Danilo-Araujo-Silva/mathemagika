package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CalendarData
 *
 * Full name:        System`CalendarData
 *
 *                   CalendarData[] gives countries with prebuilt calendar schedules.
 * Usage:            CalendarData[country] gives available subspecifications for country.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CalendarData
 * Documentation:    web: http://reference.wolfram.com/language/ref/CalendarData.html
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
fun calendarData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CalendarData", arguments.toMutableList(), options)
}
