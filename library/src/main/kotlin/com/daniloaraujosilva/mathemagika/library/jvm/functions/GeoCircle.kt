package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GeoCircle
 *
 * Full name:        System`GeoCircle
 *
 *                   GeoCircle[loc, r] is a two-dimensional GeoGraphics primitive that represents a circle of radius r centered at the location loc on the surface of the Earth.
 *                   GeoCircle[loc, r, {α , α }] represents a sector of a circle from bearing α  to bearing α .
 * Usage:                                1   2                                                 1             2
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoCircle
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoCircle.html
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
fun geoCircle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoCircle", arguments.toMutableList(), options)
}
