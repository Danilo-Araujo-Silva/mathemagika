package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FindVertexIndependentPaths
 * 
 * Full name:        System`FindVertexIndependentPaths
 * 
 *                   FindVertexIndependentPaths[g, s, t, k] finds at most k vertex-independent paths from vertex s to vertex t in the graph g.
 * Usage:            FindVertexIndependentPaths[{v  w, …}, …] uses rules v  w to specify the graph g. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/FindVertexIndependentPaths
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindVertexIndependentPaths.html
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
fun findVertexIndependentPaths(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindVertexIndependentPaths", arguments.toMutableList(), options)
}
