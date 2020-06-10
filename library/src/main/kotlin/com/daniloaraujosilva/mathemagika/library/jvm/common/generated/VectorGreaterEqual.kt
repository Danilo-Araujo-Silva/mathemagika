package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             VectorGreaterEqual
 * 
 * Full name:        System`VectorGreaterEqual
 * 
 *                   x  y or VectorGreaterEqual[{x, y}] yields True for vectors of length n if x  ≥ y  for all components 1 ≤ i ≤ n.
 *                                                                                               i    i
 *                   x   y or VectorGreaterEqual[{x, y}, κ] yields True for x and y if x - y ∈ κ, where κ is a proper convex cone.
 * Usage:               κ
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/VectorGreaterEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/VectorGreaterEqual.html
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
fun vectorGreaterEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VectorGreaterEqual", arguments.toMutableList(), options)
}
