package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CalendarType
 *
 * Full name:        System`CalendarType
 *
 * Usage:            CalendarType is an option that determines the calendar system in which all dates are to be interpreted and output.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CalendarType
 * Documentation:    web: http://reference.wolfram.com/language/ref/CalendarType.html
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
fun calendarType(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CalendarType", arguments.toMutableList(), options)
}
