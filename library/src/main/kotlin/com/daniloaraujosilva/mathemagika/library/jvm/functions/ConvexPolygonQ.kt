package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ConvexPolygonQ
 *
 * Full name:        System`ConvexPolygonQ
 *
 * Usage:            ConvexPolygonQ[poly] gives True if the polygon poly is convex, and False otherwise.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ConvexPolygonQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConvexPolygonQ.html
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
fun convexPolygonQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConvexPolygonQ", arguments.toMutableList(), options)
}
