package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TruncatedPolyhedron
 *
 * Full name:        System`TruncatedPolyhedron
 *
 *                   TruncatedPolyhedron[poly] gives the truncated polyhedron of poly by truncating all vertices.
 * Usage:            TruncatedPolyhedron[poly, l] truncates the polyhedron poly by a length ratio l at its vertices.
 *
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TruncatedPolyhedron
 * Documentation:    web: http://reference.wolfram.com/language/ref/TruncatedPolyhedron.html
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
fun truncatedPolyhedron(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TruncatedPolyhedron", arguments.toMutableList(), options)
}
