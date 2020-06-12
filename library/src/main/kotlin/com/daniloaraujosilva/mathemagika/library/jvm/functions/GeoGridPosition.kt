package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeoGridPosition
 *
 * Full name:        System`GeoGridPosition
 *
 *                   GeoGridPosition[{x, y}, proj] represents a point {x, y} in a planimetric cartographic grid using the projection proj.
 *                   GeoGridPosition[{x, y, h}, proj] represents a point {x, y, h} in a cartographic grid with height h with respect to the reference ellipsoid.
 *                   GeoGridPosition[{{x , y }, {x , y }, …}, proj] represents an array of cartographic grid positions.
 *                                      1   1     2   2
 *                   GeoGridPosition[{x, y, h}, proj, datum] represents a point in a cartographic grid obtained by projection from data in the given datum.
 * Usage:            GeoGridPosition[entity, proj] returns the cartographic grid position of the specified geographical entity.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoGridPosition
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoGridPosition.html
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
fun geoGridPosition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoGridPosition", arguments.toMutableList(), options)
}
