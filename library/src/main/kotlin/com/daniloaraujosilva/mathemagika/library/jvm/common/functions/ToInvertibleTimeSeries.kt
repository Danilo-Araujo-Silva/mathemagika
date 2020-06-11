package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ToInvertibleTimeSeries
 *
 * Full name:        System`ToInvertibleTimeSeries
 *
 * Usage:            ToInvertibleTimeSeries[tproc] returns an invertible version of a time series process tproc.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ToInvertibleTimeSeries
 * Documentation:    web: http://reference.wolfram.com/language/ref/ToInvertibleTimeSeries.html
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
fun toInvertibleTimeSeries(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ToInvertibleTimeSeries", arguments.toMutableList(), options)
}
