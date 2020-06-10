package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             WeaklyConnectedComponents
 * 
 * Full name:        System`WeaklyConnectedComponents
 * 
 *                   WeaklyConnectedComponents[g] gives the weakly connected components of the graph g.
 *                   WeaklyConnectedComponents[g, {v , v , …}] gives the weakly connected components that include at least one of the vertices v , v , ….
 *                                                  1   2                                                                                       1   2
 *                   WeaklyConnectedComponents[g, patt] gives the connected components that include a vertex that matches the pattern patt.
 * Usage:            WeaklyConnectedComponents[{v  w, …}, …] uses rules v  w to specify the graph g. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/WeaklyConnectedComponents
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeaklyConnectedComponents.html
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
fun weaklyConnectedComponents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeaklyConnectedComponents", arguments.toMutableList(), options)
}
