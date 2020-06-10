package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DayName
 * 
 * Full name:        System`DayName
 * 
 *                   DayName[] gives the current day of the week.
 * Usage:            DayName[date] gives the day of the week for the given date.
 * 
 * Options:          CalendarType -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DayName
 * Documentation:    web: http://reference.wolfram.com/language/ref/DayName.html
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
fun dayName(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DayName", arguments.toMutableList(), options)
}
