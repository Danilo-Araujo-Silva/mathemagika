package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EarthquakeData
 *
 * Full name:        System`EarthquakeData
 *
 *                   EarthquakeData[loc] gives all earthquake properties for the location corresponding to loc.
 *                   EarthquakeData[loc, mag] restricts earthquakes returned to the magnitude range mag.
 *                   EarthquakeData[loc, mag, {start, end}] gives earthquake data within the magnitude range mag during the time interval start to end.
 *                   EarthquakeData[loc, mag, {start, end}, property] gives a time series for the specific earthquake property for earthquakes within the magnitude range mag during the time interval start to end.
 * Usage:            EarthquakeData[entity, property] returns data for a specific earthquake.
 *
 * Options:          TimeZone :> $TimeZone
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EarthquakeData
 * Documentation:    web: http://reference.wolfram.com/language/ref/EarthquakeData.html
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
fun earthquakeData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EarthquakeData", arguments.toMutableList(), options)
}
