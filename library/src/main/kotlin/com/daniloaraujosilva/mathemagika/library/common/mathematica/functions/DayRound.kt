package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DayRound
 *
 * Full name:        System`DayRound
 *
 *                   DayRound[date, daytype] rounds date to the nearest day of daytype, using the next-day rounding convention.
 * Usage:            DayRound[date, daytype, rounding] rounds date to the nearest day of daytype, using rounding.
 *
 *                   CalendarType -> Automatic
 * Options:          HolidayCalendar -> {UnitedStates, Default}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DayRound
 * Documentation:    web: http://reference.wolfram.com/language/ref/DayRound.html
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
fun dayRound(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DayRound", arguments.toMutableList(), options)
}
