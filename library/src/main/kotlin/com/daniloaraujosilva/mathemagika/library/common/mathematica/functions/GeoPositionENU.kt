package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GeoPositionENU
 *
 * Full name:        System`GeoPositionENU
 *
 *                   GeoPositionENU[{east, north, up}, p]  represents a position with local Cartesian coordinates {east, north, up} in a reference system centered at the position p.
 *                   GeoPositionENU[{{e , n , u }, {e , n , u }, …}, p] represents an array of positions.
 *                                     1   1   1     2   2   2
 * Usage:            GeoPositionENU[entity, p] returns the Cartesian position with respect to p of the specified geographical entity.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoPositionENU
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoPositionENU.html
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
fun geoPositionENU(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoPositionENU", arguments.toMutableList(), options)
}
