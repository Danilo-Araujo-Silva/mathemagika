package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HolidayCalendar
 *
 * Full name:        System`HolidayCalendar
 *
 * Usage:            HolidayCalendar is an option that specifies the holiday calendar schedule in business day functions.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HolidayCalendar
 * Documentation:    web: http://reference.wolfram.com/language/ref/HolidayCalendar.html
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
fun holidayCalendar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HolidayCalendar", arguments.toMutableList(), options)
}
