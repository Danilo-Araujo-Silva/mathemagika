package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             VertexConnectivity
 * 
 * Full name:        System`VertexConnectivity
 * 
 *                   VertexConnectivity[g] gives the vertex connectivity of the graph g.
 *                   VertexConnectivity[g, s, t] gives the s-t vertex connectivity of the graph g.
 * Usage:            VertexConnectivity[{v  w, …}, …] uses rules v  w to specify the graph g.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/VertexConnectivity
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexConnectivity.html
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
fun vertexConnectivity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexConnectivity", arguments.toMutableList(), options)
}
