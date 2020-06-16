package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GeoPosition
 *
 * Full name:        System`GeoPosition
 *
 *                   GeoPosition[{lat, lon}] represents a geodetic position with latitude lat and longitude lon.
 *                   GeoPosition[{lat, lon, h}] represents a geodetic position with height h relative to the reference ellipsoid.
 *                   GeoPosition[{lat, lon, h}, datum] represents a geodetic position referring to the specified datum.
 *                   GeoPosition[{{lat , lon }, {lat , lon }, …}, datum] represents an array of geodetic positions.
 *                                    1     1       2     2
 * Usage:            GeoPosition[entity] returns the geodetic position of the specified geographical entity.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoPosition
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoPosition.html
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
fun geoPosition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoPosition", arguments.toMutableList(), options)
}
