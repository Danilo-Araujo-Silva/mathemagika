package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CanonicalGraph
 * 
 * Full name:        System`CanonicalGraph
 * 
 *                   CanonicalGraph[g] gives a canonical form of the graph g.
 * Usage:            CanonicalGraph[{v  w, …}] uses rules v  w to specify the graph.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/CanonicalGraph
 * Documentation:    web: http://reference.wolfram.com/language/ref/CanonicalGraph.html
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
fun canonicalGraph(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CanonicalGraph", arguments.toMutableList(), options)
}
