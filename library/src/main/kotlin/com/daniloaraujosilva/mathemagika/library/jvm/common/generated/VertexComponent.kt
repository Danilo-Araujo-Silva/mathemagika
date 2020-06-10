package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             VertexComponent
 * 
 * Full name:        System`VertexComponent
 * 
 *                   VertexComponent[g, {v , v , …}] gives the vertices in the graph g that have a path to at least one of v , v , … .
 *                                        1   2                                                                             1   2
 *                   VertexComponent[g, {v , v , …}, k] gives the vertices with a path to at least one of v , v , … of at most length k.
 *                                        1   2                                                            1   2
 *                   VertexComponent[g, {v , v , …}, {k}] gives the vertices at length exactly k.
 *                                        1   2
 * Usage:            VertexComponent[{v  w, …}, …] uses rules v  w to specify the graph g.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/VertexComponent
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexComponent.html
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
fun vertexComponent(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexComponent", arguments.toMutableList(), options)
}
