package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GeoVisibleRegionBoundary
 * 
 * Full name:        System`GeoVisibleRegionBoundary
 * 
 *                   GeoVisibleRegionBoundary[{lat, lon, h}] is a one-dimensional GeoGraphics primitive that represents the boundary of the region on the surface of the Earth visible from the point of coordinates lat, lon and height h above the reference ellipsoid.
 * Usage:            GeoVisibleRegionBoundary[pos] represents the boundary of the region visible from the position pos.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/GeoVisibleRegionBoundary
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoVisibleRegionBoundary.html
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
fun geoVisibleRegionBoundary(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoVisibleRegionBoundary", arguments.toMutableList(), options)
}
