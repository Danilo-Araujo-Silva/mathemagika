package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TimeSeriesRescale
 *
 * Full name:        System`TimeSeriesRescale
 *
 *                   TimeSeriesRescale[tseries, {t   , t   }] rescales the times in time series tseries to run from t    to t   .
 *                                                min   max                                                          min     max
 *                   TimeSeriesRescale[tseries, {t   , t   , t }] rescales times in units of t  including "Month", "Quarter", or "Year".
 * Usage:                                         min   max   u                               u
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TimeSeriesRescale
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeSeriesRescale.html
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
fun timeSeriesRescale(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeSeriesRescale", arguments.toMutableList(), options)
}
