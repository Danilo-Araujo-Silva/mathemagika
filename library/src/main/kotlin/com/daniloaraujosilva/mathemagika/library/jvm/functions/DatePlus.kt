package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DatePlus
 *
 * Full name:        System`DatePlus
 *
 *                   DatePlus[date, n] gives the date n days after date.
 *                   DatePlus[date, {n, step}] gives the date n calendar steps after date.
 *                   DatePlus[date, {{n , step }, {n , step }, …}] gives a date offset by n  steps of each specified size.
 *                                     1      1     2      2                               i
 *                   DatePlus[n] gives the date n days after the current date.
 * Usage:            DatePlus[offset] gives the date with the specified offset from the current date.
 *
 *                   CalendarType -> Automatic
 * Options:          HolidayCalendar -> {UnitedStates, Default}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DatePlus
 * Documentation:    web: http://reference.wolfram.com/language/ref/DatePlus.html
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
fun datePlus(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DatePlus", arguments.toMutableList(), options)
}
