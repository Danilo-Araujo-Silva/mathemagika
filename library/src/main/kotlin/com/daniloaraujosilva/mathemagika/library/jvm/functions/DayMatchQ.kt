package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DayMatchQ
 *
 * Full name:        System`DayMatchQ
 *
 * Usage:            DayMatchQ[date, daytype] returns True if the date matches the daytype specification and returns False otherwise.
 *
 *                   CalendarType -> Automatic
 * Options:          HolidayCalendar -> {UnitedStates, Default}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DayMatchQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/DayMatchQ.html
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
fun dayMatchQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DayMatchQ", arguments.toMutableList(), options)
}
