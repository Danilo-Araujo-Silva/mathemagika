package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CanonicalizePolyhedron
 *
 * Full name:        System`CanonicalizePolyhedron
 *
 * Usage:            CanonicalizePolyhedron[poly] gives a canonical representation of the polyhedron poly with shared coordinates and with inner and outer boundaries.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CanonicalizePolyhedron
 * Documentation:    web: http://reference.wolfram.com/language/ref/CanonicalizePolyhedron.html
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
fun canonicalizePolyhedron(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CanonicalizePolyhedron", arguments.toMutableList(), options)
}
