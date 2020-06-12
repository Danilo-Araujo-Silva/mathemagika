package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TimeSeriesForecast
 *
 * Full name:        System`TimeSeriesForecast
 *
 *                   TimeSeriesForecast[tproc, data, k] gives the k-step-ahead forecast beyond data according to the time series process tproc.
 * Usage:            TimeSeriesForecast[tsmod, k] gives the k-step-ahead forecast for TimeSeriesModel tsmod.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TimeSeriesForecast
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeSeriesForecast.html
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
fun timeSeriesForecast(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeSeriesForecast", arguments.toMutableList(), options)
}
