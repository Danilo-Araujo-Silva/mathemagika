package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TimeSeriesWindow
 *
 * Full name:        System`TimeSeriesWindow
 *
 *                   TimeSeriesWindow[tseries, {t   , t   }] gives the elements of the time series tseries that fall between t    and t   .
 *                                               min   max                                                                    min      max
 * Usage:            TimeSeriesWindow[tseries, windowspec] gives the elements of the time series tseries that satisfy the window specification windowspec.
 *
 *                   CalendarType -> Gregorian
 *                   HolidayCalendar -> {UnitedStates, Default}
 *                   IncludeWindowTimes -> False
 * Options:          ResamplingMethod -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TimeSeriesWindow
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeSeriesWindow.html
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
fun timeSeriesWindow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeSeriesWindow", arguments.toMutableList(), options)
}
