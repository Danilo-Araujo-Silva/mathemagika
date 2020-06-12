package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SimplePolyhedronQ
 *
 * Full name:        System`SimplePolyhedronQ
 *
 * Usage:            SimplePolyhedronQ[poly] gives True if the polyhedron poly is simple and False otherwise.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SimplePolyhedronQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/SimplePolyhedronQ.html
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
fun simplePolyhedronQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SimplePolyhedronQ", arguments.toMutableList(), options)
}
