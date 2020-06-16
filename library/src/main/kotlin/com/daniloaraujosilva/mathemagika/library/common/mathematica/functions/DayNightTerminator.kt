package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DayNightTerminator
 *
 * Full name:        System`DayNightTerminator
 *
 *                   DayNightTerminator[] is a one-dimensional GeoGraphics primitive that represents the separation line between the halves of the Earth currently in daytime and nighttime.
 * Usage:            DayNightTerminator[datespec] represents the separation line between day and night for the specified date.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DayNightTerminator
 * Documentation:    web: http://reference.wolfram.com/language/ref/DayNightTerminator.html
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
fun dayNightTerminator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DayNightTerminator", arguments.toMutableList(), options)
}
