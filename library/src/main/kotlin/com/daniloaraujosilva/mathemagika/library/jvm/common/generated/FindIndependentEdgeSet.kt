package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FindIndependentEdgeSet
 * 
 * Full name:        System`FindIndependentEdgeSet
 * 
 *                   FindIndependentEdgeSet[g] finds an independent edge set of the graph g with a maximum number of edges.
 * Usage:            FindIndependentEdgeSet[{v  w, …}] uses rules v  w to specify the graph g.
 * 
 * Options:          EdgeWeight -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/FindIndependentEdgeSet
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindIndependentEdgeSet.html
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
fun findIndependentEdgeSet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindIndependentEdgeSet", arguments.toMutableList(), options)
}
