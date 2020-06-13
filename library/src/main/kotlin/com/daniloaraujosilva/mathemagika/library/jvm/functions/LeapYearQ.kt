package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LeapYearQ
 *
 * Full name:        System`LeapYearQ
 *
 * Usage:            LeapYearQ[date] returns True if the year corresponding to date is a leap year.
 *
 * Options:          CalendarType -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LeapYearQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/LeapYearQ.html
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
fun leapYearQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeapYearQ", arguments.toMutableList(), options)
}
