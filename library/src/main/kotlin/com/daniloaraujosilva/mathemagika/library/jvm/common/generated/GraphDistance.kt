package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GraphDistance
 * 
 * Full name:        System`GraphDistance
 * 
 *                   GraphDistance[g, s, t] gives the distance from source vertex s to target vertex t in the graph g.
 *                   GraphDistance[g, s] gives the distance from s to all vertices of the graph g.
 * Usage:            GraphDistance[{v  w, …}, …] uses rules v  w to specify the graph g.
 * 
 *                   Method -> Automatic
 * Options:          WorkingPrecision -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/GraphDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/GraphDistance.html
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
fun graphDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphDistance", arguments.toMutableList(), options)
}
