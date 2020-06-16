package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DayCount
 *
 * Full name:        System`DayCount
 *
 *                   DayCount[date , date ] gives the number of days from date  to date .
 *                                1      2                                    1        2
 *                   DayCount[date , date , daytype] gives the number of days of the specified daytype from date  to date .
 * Usage:                         1      2                                                                      1        2
 *
 *                   CalendarType -> Automatic
 * Options:          HolidayCalendar -> {UnitedStates, Default}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DayCount
 * Documentation:    web: http://reference.wolfram.com/language/ref/DayCount.html
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
fun dayCount(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DayCount", arguments.toMutableList(), options)
}
