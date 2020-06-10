package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             VertexOutComponent
 * 
 * Full name:        System`VertexOutComponent
 * 
 *                   VertexOutComponent[g, {v , v , …}] gives the vertices in the graph g that have a directed path from at least one of v , v , ….
 *                                           1   2                                                                                        1   2
 *                   VertexOutComponent[g, {v , v , …}, k] gives the vertices with a directed path from at least one of v , v , … of at most length k.
 *                                           1   2                                                                       1   2
 *                   VertexOutComponent[g, {v , v , …}, {k}] gives the vertices at length exactly k.
 *                                           1   2
 * Usage:            VertexOutComponent[{v  w, …}, …] uses rules v  w to specify the graph g. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/VertexOutComponent
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexOutComponent.html
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
fun vertexOutComponent(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexOutComponent", arguments.toMutableList(), options)
}
