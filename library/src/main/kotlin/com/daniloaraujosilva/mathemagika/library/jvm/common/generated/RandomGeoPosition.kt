package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RandomGeoPosition
 * 
 * Full name:        System`RandomGeoPosition
 * 
 *                   RandomGeoPosition[] gives a pseudorandom geo position uniformly distributed on the surface of the Earth.
 *                   RandomGeoPosition[{{latmin, lonmin}, {latmax, lonmax}}] gives a pseudorandom geo position uniformly distributed in the given geo bounding box. 
 *                   RandomGeoPosition[g] gives a pseudorandom geo position uniformly distributed in the geo region g.
 *                   RandomGeoPosition[g, n] gives a list of n pseudorandom geo positions uniformly distributed in the geo region g.
 *                   RandomGeoPosition[g, {n , n , …}] gives an n  × n  × … pseudorandom geo position array.
 * Usage:                                   1   2                1    2
 * 
 *                   GeoModel -> Automatic
 * Options:          GeoProjection -> None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/RandomGeoPosition
 * Documentation:    web: http://reference.wolfram.com/language/ref/RandomGeoPosition.html
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
fun randomGeoPosition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RandomGeoPosition", arguments.toMutableList(), options)
}
