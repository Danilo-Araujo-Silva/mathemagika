package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             VectorLess
 * 
 * Full name:        System`VectorLess
 * 
 *                   x  y or VectorLess[{x, y}] yields True for vectors of length n if x  < y  for all components 1 ≤ i ≤ n.
 *                                                                                       i    i
 *                   x   y or VectorLess[{x, y}, κ] yields True for x and y if y - x ∈ interior(κ), where κ is a proper convex cone.
 * Usage:               κ
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/VectorLess
 * Documentation:    web: http://reference.wolfram.com/language/ref/VectorLess.html
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
fun vectorLess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VectorLess", arguments.toMutableList(), options)
}
