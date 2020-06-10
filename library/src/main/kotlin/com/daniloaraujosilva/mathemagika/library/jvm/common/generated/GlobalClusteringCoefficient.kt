package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GlobalClusteringCoefficient
 * 
 * Full name:        System`GlobalClusteringCoefficient
 * 
 *                   GlobalClusteringCoefficient[g] gives the global clustering coefficient of the graph g.
 * Usage:            GlobalClusteringCoefficient[{v  w, …}] uses rules v  w to specify the graph g. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/GlobalClusteringCoefficient
 * Documentation:    web: http://reference.wolfram.com/language/ref/GlobalClusteringCoefficient.html
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
fun globalClusteringCoefficient(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GlobalClusteringCoefficient", arguments.toMutableList(), options)
}
