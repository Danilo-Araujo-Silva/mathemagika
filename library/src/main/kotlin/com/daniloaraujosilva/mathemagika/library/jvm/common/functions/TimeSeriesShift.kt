package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TimeSeriesShift
 *
 * Full name:        System`TimeSeriesShift
 *
 * Usage:            TimeSeriesShift[tseries, shift] shifts the time series tseries to the left or right according to shift.
 *
 *                   CalendarType -> Gregorian
 *                   HolidayCalendar -> {UnitedStates, Default}
 * Options:          TimeZone :> $TimeZone
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TimeSeriesShift
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeSeriesShift.html
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
fun timeSeriesShift(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeSeriesShift", arguments.toMutableList(), options)
}
