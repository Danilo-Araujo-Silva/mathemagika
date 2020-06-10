package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             VectorLessEqual
 * 
 * Full name:        System`VectorLessEqual
 * 
 *                   x  y or VectorLessEqual[{x, y}] yields True for vectors of length n if x  ≤ y  for all components 1 ≤ i ≤ n.
 *                                                                                            i    i
 *                   x   y or VectorLessEqual[{x, y}, κ] yields True for x and y if y - x ∈ κ, where κ is a proper convex cone.
 * Usage:               κ
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/VectorLessEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/VectorLessEqual.html
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
fun vectorLessEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VectorLessEqual", arguments.toMutableList(), options)
}
