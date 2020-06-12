package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SamplingPeriod
 *
 * Full name:        System`SamplingPeriod
 *
 * Usage:            SamplingPeriod is an option to StateSpaceModel etc. that specifies the sampling period.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SamplingPeriod
 * Documentation:    web: http://reference.wolfram.com/language/ref/SamplingPeriod.html
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
fun samplingPeriod(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SamplingPeriod", arguments.toMutableList(), options)
}
