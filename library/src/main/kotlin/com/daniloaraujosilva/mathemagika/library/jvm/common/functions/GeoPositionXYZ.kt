package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeoPositionXYZ
 *
 * Full name:        System`GeoPositionXYZ
 *
 *                   GeoPositionXYZ[{x, y, z}] represents a position in a Cartesian geocentric coordinate system.
 *                   GeoPositionXYZ[{x, y, z}, datum] represents a point referred to the specified datum.
 *                   GeoPositionXYZ[{{x , y , z }, {x , y , z }, …}, datum] represents an array of points in a Cartesian geocentric coordinate system.
 *                                     1   1   1     2   2   2
 * Usage:            GeoPositionXYZ[entity] returns the Cartesian geocentric position of the given geographical entity.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoPositionXYZ
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoPositionXYZ.html
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
fun geoPositionXYZ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoPositionXYZ", arguments.toMutableList(), options)
}
