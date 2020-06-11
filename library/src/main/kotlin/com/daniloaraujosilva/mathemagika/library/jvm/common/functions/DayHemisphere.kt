package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DayHemisphere
 *
 * Full name:        System`DayHemisphere
 *
 *                   DayHemisphere[] is a two-dimensional GeoGraphics primitive that represents the half of the Earth that is currently in daylight.
 * Usage:            DayHemisphere[datespec] represents the daylight half of the Earth for the specified date.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DayHemisphere
 * Documentation:    web: http://reference.wolfram.com/language/ref/DayHemisphere.html
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
fun dayHemisphere(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DayHemisphere", arguments.toMutableList(), options)
}
