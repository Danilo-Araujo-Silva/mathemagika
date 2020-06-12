package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ConnectedComponents
 *
 * Full name:        System`ConnectedComponents
 *
 *                   ConnectedComponents[g] gives the connected components of the graph g.
 *                   ConnectedComponents[g, {v , v , …}] gives the connected components that include at least one of the vertices v , v , … .
 *                                            1   2                                                                                1   2
 *                   ConnectedComponents[g, patt] gives the connected components that include a vertex that matches the pattern patt.
 * Usage:            ConnectedComponents[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ConnectedComponents
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConnectedComponents.html
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
fun connectedComponents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConnectedComponents", arguments.toMutableList(), options)
}
