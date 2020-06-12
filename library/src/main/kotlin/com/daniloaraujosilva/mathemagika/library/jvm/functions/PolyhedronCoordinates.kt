package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PolyhedronCoordinates
 *
 * Full name:        System`PolyhedronCoordinates
 *
 * Usage:            PolyhedronCoordinates[poly] gives a list of coordinates in the polyhedron poly.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PolyhedronCoordinates
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolyhedronCoordinates.html
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
fun polyhedronCoordinates(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolyhedronCoordinates", arguments.toMutableList(), options)
}
