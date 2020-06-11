package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ValueDimensions
 *
 * Full name:        System`ValueDimensions
 *
 * Usage:            ValueDimensions is an option to TemporalData, TimeSeries, and EventSeries that specifies the dimension of the value space.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ValueDimensions
 * Documentation:    web: http://reference.wolfram.com/language/ref/ValueDimensions.html
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
fun valueDimensions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ValueDimensions", arguments.toMutableList(), options)
}
