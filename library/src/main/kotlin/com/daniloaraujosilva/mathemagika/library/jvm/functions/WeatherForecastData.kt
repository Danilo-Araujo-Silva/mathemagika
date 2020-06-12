package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WeatherForecastData
 *
 * Full name:        System`WeatherForecastData
 *
 *                   WeatherForecastData[loc] gives the most recent forecast for all weather forecast properties for the specified location.
 *                   WeatherForecastData[prop] gives the forecast for the specified property for the current location.
 *                   WeatherForecastData[date] gives the forecast at the time or times specified by date for all properties at the current location.
 *                   WeatherForecastData[loc, prop] gives the forecast for the property at the specified location.
 * Usage:            WeatherForecastData[loc, prop, datespec] gives the forecast at the time or times specified by datespec for the property at the location.
 *
 * Options:          UnitSystem :> $UnitSystem
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WeatherForecastData
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeatherForecastData.html
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
fun weatherForecastData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeatherForecastData", arguments.toMutableList(), options)
}
