package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EventSeries
 *
 * Full name:        System`EventSeries
 *
 *                   EventSeries[{{t , v }, {t , v } …}] represents a series of events given as time-value pairs {t , v }.
 *                                  1   1     2   2                                                                i   i
 *                   EventSeries[{v , v , …}, tspec] represents a series of events with values v  at times specified by tspec.
 * Usage:                          1   2                                                        i
 *
 *                   CalendarType -> Gregorian
 *                   DateFunction -> Automatic
 *                   HolidayCalendar -> {UnitedStates, Default}
 *                   MetaInformation -> None
 *                   MissingDataMethod -> None
 *                   TemporalRegularity -> Automatic
 *                   TimeZone :> $TimeZone
 * Options:          ValueDimensions -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EventSeries
 * Documentation:    web: http://reference.wolfram.com/language/ref/EventSeries.html
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
fun eventSeries(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EventSeries", arguments.toMutableList(), options)
}
