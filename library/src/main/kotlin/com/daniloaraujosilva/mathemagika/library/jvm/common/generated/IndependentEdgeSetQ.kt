package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             IndependentEdgeSetQ
 * 
 * Full name:        System`IndependentEdgeSetQ
 * 
 * Usage:            IndependentEdgeSetQ[g, elist] yields True if the edge list elist is an independent edge set of the graph g, and False otherwise.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/IndependentEdgeSetQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/IndependentEdgeSetQ.html
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
fun independentEdgeSetQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IndependentEdgeSetQ", arguments.toMutableList(), options)
}
