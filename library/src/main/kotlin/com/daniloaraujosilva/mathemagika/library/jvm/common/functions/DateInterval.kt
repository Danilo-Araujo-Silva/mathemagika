package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DateInterval
 *
 * Full name:        System`DateInterval
 *
 *                   DateInterval[{start, end}] represents the continuous interval of time between start and end.
 *                   DateInterval[{start, end}, gran] represents an interval of dates with calendar granularity gran.
 *                   DateInterval[{{start , end }, {start , end }, …}] represents the union of intervals start  to end , start  to end , ….
 *                                       1     1         2     2                                              1       1       2       2
 * Usage:            DateInterval[gdate] gives the date interval from the initial to final instants of the granular date object gdate.
 *
 *                   CalendarType -> Automatic
 * Options:          TimeZone -> Automatic
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DateInterval
 * Documentation:    web: http://reference.wolfram.com/language/ref/DateInterval.html
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
fun dateInterval(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DateInterval", arguments.toMutableList(), options)
}
