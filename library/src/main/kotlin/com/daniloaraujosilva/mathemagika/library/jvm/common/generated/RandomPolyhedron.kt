package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RandomPolyhedron
 * 
 * Full name:        System`RandomPolyhedron
 * 
 *                   RandomPolyhedron[spec] gives a pseudorandom polyhedron with the specified specification spec.
 * Usage:            RandomPolyhedron[spec, k] gives a list of k pseudorandom polyhedra.
 * 
 *                   DataRange -> Automatic
 * Options:          WorkingPrecision -> MachinePrecision
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/RandomPolyhedron
 * Documentation:    web: http://reference.wolfram.com/language/ref/RandomPolyhedron.html
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
fun randomPolyhedron(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RandomPolyhedron", arguments.toMutableList(), options)
}
