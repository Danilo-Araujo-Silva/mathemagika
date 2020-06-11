package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AdjustTimeSeriesForecast
 *
 * Full name:        System`AdjustTimeSeriesForecast
 *
 * Usage:            AdjustTimeSeriesForecast[tproc, forecast, newdata] adjusts forecast using new observations newdata according to the time series model tproc.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AdjustTimeSeriesForecast
 * Documentation:    web: http://reference.wolfram.com/language/ref/AdjustTimeSeriesForecast.html
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
fun adjustTimeSeriesForecast(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AdjustTimeSeriesForecast", arguments.toMutableList(), options)
}
