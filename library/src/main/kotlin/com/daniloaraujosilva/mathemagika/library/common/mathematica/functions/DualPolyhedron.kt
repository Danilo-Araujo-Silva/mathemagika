package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DualPolyhedron
 *
 * Full name:        System`DualPolyhedron
 *
 * Usage:            DualPolyhedron[poly] gives the dual polyhedron of the polyhedron poly.
 *
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DualPolyhedron
 * Documentation:    web: http://reference.wolfram.com/language/ref/DualPolyhedron.html
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
fun dualPolyhedron(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DualPolyhedron", arguments.toMutableList(), options)
}
