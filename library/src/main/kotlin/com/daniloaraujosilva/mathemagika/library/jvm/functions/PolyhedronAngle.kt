package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PolyhedronAngle
 *
 * Full name:        System`PolyhedronAngle
 *
 *                   PolyhedronAngle[poly, p] gives the solid angle at the point p and spanned by edges with common point p.
 * Usage:            PolyhedronAngle[poly, e] gives the dihedral angle between the two faces with common edge e.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PolyhedronAngle
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolyhedronAngle.html
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
fun polyhedronAngle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolyhedronAngle", arguments.toMutableList(), options)
}
