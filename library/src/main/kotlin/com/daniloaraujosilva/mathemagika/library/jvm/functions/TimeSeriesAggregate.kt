package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TimeSeriesAggregate
 *
 * Full name:        System`TimeSeriesAggregate
 *
 *                   TimeSeriesAggregate[tseries, dt] computes the mean value of tseries over non-overlapping windows of width dt.
 * Usage:            TimeSeriesAggregate[tseries, dt, f] applies the function f to the values of tseries in non-overlapping windows of width dt.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TimeSeriesAggregate
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeSeriesAggregate.html
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
fun timeSeriesAggregate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeSeriesAggregate", arguments.toMutableList(), options)
}
