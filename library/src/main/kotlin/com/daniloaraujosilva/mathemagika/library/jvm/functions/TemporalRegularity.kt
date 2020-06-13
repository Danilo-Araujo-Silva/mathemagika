package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TemporalRegularity
 *
 * Full name:        System`TemporalRegularity
 *
 * Usage:            TemporalRegularity is an option for TemporalData, TimeSeries, and EventSeries that controls whether the paths are assumed to be uniformly spaced in time.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TemporalRegularity
 * Documentation:    web: http://reference.wolfram.com/language/ref/TemporalRegularity.html
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
fun temporalRegularity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TemporalRegularity", arguments.toMutableList(), options)
}
