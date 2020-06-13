package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TimeSeries
 *
 * Full name:        System`TimeSeries
 *
 *                   TimeSeries[{{t , v }, {t , v } …}] represents a time series specified by time-value pairs {t , v }.
 *                                 1   1     2   2                                                               i   i
 *                   TimeSeries[{v , v , …}, tspec] represents a time series with values v  at times specified by tspec.
 * Usage:                         1   2                                                   i
 *
 *                   CalendarType -> Gregorian
 *                   DateFunction -> Automatic
 *                   HolidayCalendar -> {UnitedStates, Default}
 *                   MetaInformation -> None
 *                   MissingDataMethod -> None
 *                   ResamplingMethod -> Automatic
 *                   TemporalRegularity -> Automatic
 *                   TimeZone :> $TimeZone
 * Options:          ValueDimensions -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TimeSeries
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeSeries.html
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
fun timeSeries(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeSeries", arguments.toMutableList(), options)
}
