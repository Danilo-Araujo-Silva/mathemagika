package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             VectorGreater
 *
 * Full name:        System`VectorGreater
 *
 *                   x  y or VectorGreater[{x, y}] yields True for vectors of length n if x  > y  for all components 1 ≤ i ≤ n.
 *                                                                                          i    i
 *                   x   y or VectorGreater[{x, y}, κ] yields True for x and y if x - y ∈ interior(κ), where κ is a proper convex cone.
 * Usage:               κ
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VectorGreater
 * Documentation:    web: http://reference.wolfram.com/language/ref/VectorGreater.html
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
fun vectorGreater(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VectorGreater", arguments.toMutableList(), options)
}
