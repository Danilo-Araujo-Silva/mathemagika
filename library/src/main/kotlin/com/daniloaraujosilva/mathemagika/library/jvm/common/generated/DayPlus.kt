package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DayPlus
 * 
 * Full name:        System`DayPlus
 * 
 *                   DayPlus[date, n] gives the date n days away from date.
 * Usage:            DayPlus[date, n, daytype] gives the date that is n days of daytype away from date.
 * 
 *                   CalendarType -> Automatic
 * Options:          HolidayCalendar -> {UnitedStates, Default}
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DayPlus
 * Documentation:    web: http://reference.wolfram.com/language/ref/DayPlus.html
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
fun dayPlus(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DayPlus", arguments.toMutableList(), options)
}
