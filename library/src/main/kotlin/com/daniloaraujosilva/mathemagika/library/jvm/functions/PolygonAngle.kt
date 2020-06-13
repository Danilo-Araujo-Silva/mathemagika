package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PolygonAngle
 *
 * Full name:        System`PolygonAngle
 *
 *                   PolygonAngle[poly] gives a list of angles at the vertex points of poly.
 *                   PolygonAngle[poly, p] gives the angle at the vertex point p of a polygon poly.
 *                   PolygonAngle[poly, i] gives the angle at the point p  of poly in canonical form Polygon[{p , …, p }, data].
 *                                                                       i                                     1      n
 * Usage:            PolygonAngle[…, "spec"] gives the angle specified by "spec".
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PolygonAngle
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolygonAngle.html
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
fun polygonAngle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolygonAngle", arguments.toMutableList(), options)
}
