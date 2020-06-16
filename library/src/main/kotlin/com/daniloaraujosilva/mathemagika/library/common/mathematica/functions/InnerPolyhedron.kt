package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             InnerPolyhedron
 *
 * Full name:        System`InnerPolyhedron
 *
 * Usage:            InnerPolyhedron[poly] gives the inner polyhedron of the polyhedron poly.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InnerPolyhedron
 * Documentation:    web: http://reference.wolfram.com/language/ref/InnerPolyhedron.html
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
fun innerPolyhedron(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InnerPolyhedron", arguments.toMutableList(), options)
}
