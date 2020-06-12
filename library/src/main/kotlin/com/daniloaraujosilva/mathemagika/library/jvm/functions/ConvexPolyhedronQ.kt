package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ConvexPolyhedronQ
 *
 * Full name:        System`ConvexPolyhedronQ
 *
 * Usage:            ConvexPolyhedronQ[poly] gives True if the polyhedron poly is convex, and False otherwise.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ConvexPolyhedronQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConvexPolyhedronQ.html
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
fun convexPolyhedronQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConvexPolyhedronQ", arguments.toMutableList(), options)
}
