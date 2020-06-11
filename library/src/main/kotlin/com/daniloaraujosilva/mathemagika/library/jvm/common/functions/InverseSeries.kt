package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InverseSeries
 *
 * Full name:        System`InverseSeries
 *
 *                   InverseSeries[s] takes the series s, and gives a series for the inverse of the function represented by s.
 * Usage:            InverseSeries[s, x] uses the variable x in the inverse series.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseSeries
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseSeries.html
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
fun inverseSeries(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseSeries", arguments.toMutableList(), options)
}
