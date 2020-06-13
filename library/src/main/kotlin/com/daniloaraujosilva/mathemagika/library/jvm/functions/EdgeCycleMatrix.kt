package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EdgeCycleMatrix
 *
 * Full name:        System`EdgeCycleMatrix
 *
 *                   EdgeCycleMatrix[g] gives the edge cycle matrix of a graph g.
 * Usage:            EdgeCycleMatrix[{v  w, …}] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EdgeCycleMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/EdgeCycleMatrix.html
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
fun edgeCycleMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EdgeCycleMatrix", arguments.toMutableList(), options)
}
