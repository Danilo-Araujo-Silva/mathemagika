package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TimeSeriesResample
 *
 * Full name:        System`TimeSeriesResample
 *
 *                   TimeSeriesResample[tseries] uniformly resamples tseries according to its minimum time increment.
 * Usage:            TimeSeriesResample[tseries, rspec] resamples tseries according to rspec.
 *
 *                   CalendarType -> Gregorian
 *                   HolidayCalendar -> {UnitedStates, Default}
 *                   ResamplingMethod -> Automatic
 * Options:          TimeZone :> $TimeZone
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TimeSeriesResample
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeSeriesResample.html
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
fun timeSeriesResample(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeSeriesResample", arguments.toMutableList(), options)
}
