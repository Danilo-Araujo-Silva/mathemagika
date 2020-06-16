package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BeveledPolyhedron
 *
 * Full name:        System`BeveledPolyhedron
 *
 *                   BeveledPolyhedron[poly] gives the beveled polyhedron of poly, by beveling each edge.
 * Usage:            BeveledPolyhedron[poly, l] bevels the polyhedron poly by a length ratio l at its edges.
 *
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BeveledPolyhedron
 * Documentation:    web: http://reference.wolfram.com/language/ref/BeveledPolyhedron.html
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
fun beveledPolyhedron(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BeveledPolyhedron", arguments.toMutableList(), options)
}
