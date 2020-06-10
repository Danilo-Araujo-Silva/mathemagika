package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DayRange
 * 
 * Full name:        System`DayRange
 * 
 *                   DayRange[date , date ] gives the dates in the range from date  to date .
 *                                1      2                                        1        2
 *                   DayRange[date , date , daytype] gives the dates in the range from date  to date  that are of the specified daytype.
 * Usage:                         1      2                                                 1        2
 * 
 *                   CalendarType -> Automatic
 *                   HolidayCalendar -> {UnitedStates, Default}
 * Options:          IncludeEndPoints -> {True, True}
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DayRange
 * Documentation:    web: http://reference.wolfram.com/language/ref/DayRange.html
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
fun dayRange(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DayRange", arguments.toMutableList(), options)
}
