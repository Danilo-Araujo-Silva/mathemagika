package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             OuterPolyhedron
 * 
 * Full name:        System`OuterPolyhedron
 * 
 * Usage:            OuterPolyhedron[poly] gives the outer polyhedron of the polyhedron poly.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/OuterPolyhedron
 * Documentation:    web: http://reference.wolfram.com/language/ref/OuterPolyhedron.html
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
fun outerPolyhedron(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OuterPolyhedron", arguments.toMutableList(), options)
}
