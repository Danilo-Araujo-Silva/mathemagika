package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WeatherData
 *
 * Full name:        System`WeatherData
 *
 *                   WeatherData[loc, "property"] gives the most recent measurement for the specified weather property at the location corresponding to loc.
 *                   WeatherData[loc, "property", date] gives all measurements during the specified date.
 *                   WeatherData[loc, "property", {start, end}] gives a list of dates and measurements for the time interval start to end.
 * Usage:            WeatherData[loc, "property", {start, end, step}] gives measurements aggregated over the time period represented by step.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WeatherData
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeatherData.html
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
fun weatherData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeatherData", arguments.toMutableList(), options)
}
