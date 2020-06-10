package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             BusinessDayQ
 * 
 * Full name:        System`BusinessDayQ
 * 
 * Usage:            BusinessDayQ[date] returns True if the date is a business day and returns False otherwise.
 * 
 *                   CalendarType -> Automatic
 * Options:          HolidayCalendar -> {UnitedStates, Default}
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/BusinessDayQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/BusinessDayQ.html
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
fun businessDayQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BusinessDayQ", arguments.toMutableList(), options)
}
