package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TimeSeriesInvertibility
 *
 * Full name:        System`TimeSeriesInvertibility
 *
 * Usage:            TimeSeriesInvertibility[tproc] gives conditions for the time series process tproc to be invertible.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TimeSeriesInvertibility
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeSeriesInvertibility.html
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
fun timeSeriesInvertibility(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeSeriesInvertibility", arguments.toMutableList(), options)
}
