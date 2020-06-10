package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FindShortestPath
 * 
 * Full name:        System`FindShortestPath
 * 
 *                   FindShortestPath[g, s, t] finds the shortest path from source vertex s to target vertex t in the graph g.
 *                   FindShortestPath[g, s, All] generates a ShortestPathFunction[…] that can be applied repeatedly to different t.
 *                   FindShortestPath[g, All, t] generates a ShortestPathFunction[…] that can be applied repeatedly to different s.
 *                   FindShortestPath[g, All, All] generates a ShortestPathFunction[…] that can be applied to different s and t.
 * Usage:            FindShortestPath[{v  w, …}, …] uses rules v  w to specify the graph g. 
 * 
 *                   Method -> Automatic
 * Options:          WorkingPrecision -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/FindShortestPath
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindShortestPath.html
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
fun findShortestPath(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindShortestPath", arguments.toMutableList(), options)
}
