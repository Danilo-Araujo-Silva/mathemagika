package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TimeSeriesInsert
 *
 * Full name:        System`TimeSeriesInsert
 *
 *                   TimeSeriesInsert[tseries, {t, v}] inserts a value v at time t in the time series tseries.
 *                   TimeSeriesInsert[tseries , tseries ] inserts the time-value pairs from tseries  into tseries .
 * Usage:                                    1         2                                           2             1
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TimeSeriesInsert
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeSeriesInsert.html
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
fun timeSeriesInsert(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeSeriesInsert", arguments.toMutableList(), options)
}
