package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SnubPolyhedron
 * 
 * Full name:        System`SnubPolyhedron
 * 
 * Usage:            SnubPolyhedron[poly] gives the snub polyhedron of poly by truncating some corners.
 * 
 * Options:          WorkingPrecision -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SnubPolyhedron
 * Documentation:    web: http://reference.wolfram.com/language/ref/SnubPolyhedron.html
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
fun snubPolyhedron(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SnubPolyhedron", arguments.toMutableList(), options)
}
