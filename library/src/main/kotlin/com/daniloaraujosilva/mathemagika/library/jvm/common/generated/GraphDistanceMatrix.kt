package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GraphDistanceMatrix
 * 
 * Full name:        System`GraphDistanceMatrix
 * 
 *                   GraphDistanceMatrix[g] gives the matrix of distances between vertices for the graph g.
 *                   GraphDistanceMatrix[g, d] gives the matrix of distances between vertices of maximal distance d in the graph g.
 * Usage:            GraphDistanceMatrix[{v  w, …}, …] uses rules v  w to specify the graph g.
 * 
 *                   Method -> Automatic
 * Options:          WorkingPrecision -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/GraphDistanceMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/GraphDistanceMatrix.html
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
fun graphDistanceMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphDistanceMatrix", arguments.toMutableList(), options)
}
