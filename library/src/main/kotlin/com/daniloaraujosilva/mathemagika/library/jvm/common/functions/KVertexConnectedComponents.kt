package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             KVertexConnectedComponents
 *
 * Full name:        System`KVertexConnectedComponents
 *
 *                   KVertexConnectedComponents[g, k] gives the k-vertex-connected components of the graph g.
 *                   KVertexConnectedComponents[g, k, {v , v , …}] gives the k-vertex-connected components that include at least one of the vertices v , v , … .
 * Usage:                                               1   2                                                                                         1   2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/KVertexConnectedComponents
 * Documentation:    web: http://reference.wolfram.com/language/ref/KVertexConnectedComponents.html
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
fun kVertexConnectedComponents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KVertexConnectedComponents", arguments.toMutableList(), options)
}
