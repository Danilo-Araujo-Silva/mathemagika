package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             VertexInComponent
 *
 * Full name:        System`VertexInComponent
 *
 *                   VertexInComponent[g, {v , v , …}] gives the vertices in the graph g that have a directed path to at least one of v , v , … .
 *                                          1   2                                                                                      1   2
 *                   VertexInComponent[g, {v , v , …}, k] gives the vertices with a directed path to at least one of v , v , … of at most length k.
 *                                          1   2                                                                     1   2
 *                   VertexInComponent[g, {v , v , …}, {k}] gives the vertices at length exactly k.
 *                                          1   2
 * Usage:            VertexInComponent[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/VertexInComponent
 * Documentation:    web: http://reference.wolfram.com/language/ref/VertexInComponent.html
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
fun vertexInComponent(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VertexInComponent", arguments.toMutableList(), options)
}
