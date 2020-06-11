package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PolyhedronGenus
 *
 * Full name:        System`PolyhedronGenus
 *
 * Usage:            PolyhedronGenus[poly] gives the genus of the polyhedron poly.
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PolyhedronGenus
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolyhedronGenus.html
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
fun polyhedronGenus(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolyhedronGenus", arguments.toMutableList(), options)
}
