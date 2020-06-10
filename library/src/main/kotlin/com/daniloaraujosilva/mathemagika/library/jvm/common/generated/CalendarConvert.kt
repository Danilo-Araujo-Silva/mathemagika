package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CalendarConvert
 * 
 * Full name:        System`CalendarConvert
 * 
 *                   CalendarConvert[date, calendar] converts the date object date to the specified calendar type calendar.
 *                   CalendarConvert[date] converts to the default calendar type.
 *                   CalendarConvert[{date , …, date }, calendar] converts date  through date  to the specified calendar.
 * Usage:                                 1         n                          1             n
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/CalendarConvert
 * Documentation:    web: http://reference.wolfram.com/language/ref/CalendarConvert.html
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
fun calendarConvert(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CalendarConvert", arguments.toMutableList(), options)
}
