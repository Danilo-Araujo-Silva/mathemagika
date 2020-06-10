package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AugmentedPolyhedron
 * 
 * Full name:        System`AugmentedPolyhedron
 * 
 *                   AugmentedPolyhedron[poly] gives the augmented polyhedron poly by replacing each face by a pyramid. 
 * Usage:            AugmentedPolyhedron[poly, h] gives the augmented polyhedron with a pyramid of height h.
 * 
 * Options:          WorkingPrecision -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/AugmentedPolyhedron
 * Documentation:    web: http://reference.wolfram.com/language/ref/AugmentedPolyhedron.html
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
fun augmentedPolyhedron(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AugmentedPolyhedron", arguments.toMutableList(), options)
}
