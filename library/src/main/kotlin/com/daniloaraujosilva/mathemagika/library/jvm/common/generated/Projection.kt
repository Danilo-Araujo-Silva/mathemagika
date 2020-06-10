package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Projection
 * 
 * Full name:        System`Projection
 * 
 *                   Projection[u, v] finds the projection of the vector u onto the vector v.
 * Usage:            Projection[u, v, f] finds projections with respect to the inner product function f.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Projection
 * Documentation:    web: http://reference.wolfram.com/language/ref/Projection.html
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
fun projection(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Projection", arguments.toMutableList(), options)
}
