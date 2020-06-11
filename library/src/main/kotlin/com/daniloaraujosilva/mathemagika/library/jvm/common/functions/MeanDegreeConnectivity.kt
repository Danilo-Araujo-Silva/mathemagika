package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MeanDegreeConnectivity
 *
 * Full name:        System`MeanDegreeConnectivity
 *
 *                   MeanDegreeConnectivity[g] gives a list of k-mean degree connectivity for the graph g for successive k = 0, 1, 2… .
 *                   MeanDegreeConnectivity[g, "In"] gives a list of k-mean in-degree connectivity for the graph g.
 *                   MeanDegreeConnectivity[g, "Out"] gives a list of k-mean out-degree connectivity for the graph g.
 * Usage:            MeanDegreeConnectivity[{v  w, …}, …] uses rules v  w to specify the graph g.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MeanDegreeConnectivity
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeanDegreeConnectivity.html
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
fun meanDegreeConnectivity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeanDegreeConnectivity", arguments.toMutableList(), options)
}
