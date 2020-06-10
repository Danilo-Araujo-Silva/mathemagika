package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             KEdgeConnectedComponents
 * 
 * Full name:        System`KEdgeConnectedComponents
 * 
 *                   KEdgeConnectedComponents[g, k] gives the k-edge-connected components of the graph g.
 *                   KEdgeConnectedComponents[g, k, {v , v , …}] gives the k-edge-connected components that include at least one of the vertices v , v , ….
 *                                                    1   2                                                                                       1   2
 * Usage:            KEdgeConnectedComponents[{v  w, …}, …] uses rules v  w to specify the graph g. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/KEdgeConnectedComponents
 * Documentation:    web: http://reference.wolfram.com/language/ref/KEdgeConnectedComponents.html
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
fun kEdgeConnectedComponents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KEdgeConnectedComponents", arguments.toMutableList(), options)
}
