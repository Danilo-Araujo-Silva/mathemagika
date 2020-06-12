package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MeanGraphDistance
 *
 * Full name:        System`MeanGraphDistance
 *
 *                   MeanGraphDistance[g] gives the mean distance between all pairs of vertices in the graph g.
 * Usage:            MeanGraphDistance[{v  w, …}] uses rules v  w to specify the graph g.
 *
 *                   Method -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MeanGraphDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeanGraphDistance.html
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
fun meanGraphDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeanGraphDistance", arguments.toMutableList(), options)
}
