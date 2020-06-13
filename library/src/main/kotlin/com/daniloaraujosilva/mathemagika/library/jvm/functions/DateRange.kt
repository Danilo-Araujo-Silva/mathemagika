package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DateRange
 *
 * Full name:        System`DateRange
 *
 *                   DateRange[date , date ] gives all dates in the range from date  to date .
 *                                 1      2                                        1        2
 *                   DateRange[date , date , increment] gives the dates in the range from date  to date  that are increment apart.
 * Usage:                          1      2                                                   1        2
 *
 *                   CalendarType -> Automatic
 * Options:          HolidayCalendar -> {UnitedStates, Default}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DateRange
 * Documentation:    web: http://reference.wolfram.com/language/ref/DateRange.html
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
fun dateRange(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DateRange", arguments.toMutableList(), options)
}
