package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PolygonIntersections
 *
 * Full name:        System`PolygonIntersections
 *
 * Usage:            PolygonIntersections is an option for Graphics3D which specifies whether intersecting polygons should be left unchanged.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PolygonIntersections
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolygonIntersections.html
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
fun polygonIntersections(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolygonIntersections", arguments.toMutableList(), options)
}
