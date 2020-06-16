package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GeoVisibleRegion
 *
 * Full name:        System`GeoVisibleRegion
 *
 *                   GeoVisibleRegion[{lat, lon, h}] is a two-dimensional GeoGraphics primitive that represents the region on the surface of the Earth visible from the point of coordinates lat, lon and height h above the reference ellipsoid.
 * Usage:            GeoVisibleRegion[pos] represents the region visible from the position pos.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoVisibleRegion
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoVisibleRegion.html
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
fun geoVisibleRegion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoVisibleRegion", arguments.toMutableList(), options)
}
