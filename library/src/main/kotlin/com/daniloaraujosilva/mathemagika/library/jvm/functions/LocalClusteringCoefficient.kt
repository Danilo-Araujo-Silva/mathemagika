package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LocalClusteringCoefficient
 *
 * Full name:        System`LocalClusteringCoefficient
 *
 *                   LocalClusteringCoefficient[g] gives the list of local clustering coefficients of all vertices in the graph g.
 *                   LocalClusteringCoefficient[g, v] gives the local clustering coefficient of the vertex v in the graph g.
 * Usage:            LocalClusteringCoefficient[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LocalClusteringCoefficient
 * Documentation:    web: http://reference.wolfram.com/language/ref/LocalClusteringCoefficient.html
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
fun localClusteringCoefficient(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LocalClusteringCoefficient", arguments.toMutableList(), options)
}
