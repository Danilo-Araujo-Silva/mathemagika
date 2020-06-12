package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MeanClusteringCoefficient
 *
 * Full name:        System`MeanClusteringCoefficient
 *
 *                   MeanClusteringCoefficient[g] gives the mean clustering coefficient of the graph g.
 * Usage:            MeanClusteringCoefficient[{v  w, …}] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MeanClusteringCoefficient
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeanClusteringCoefficient.html
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
fun meanClusteringCoefficient(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeanClusteringCoefficient", arguments.toMutableList(), options)
}
