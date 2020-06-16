package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AggregationLayer
 *
 * Full name:        System`AggregationLayer
 *
 *                   AggregationLayer[f] represents a layer that aggregates an array of arbitrary rank into a vector, using the function f.
 *                   AggregationLayer[f, n] aggregates an array at level n.
 *                   AggregationLayer[f, n  ;; n ] aggregates an array at levels n  through n .
 *                                        1     2                                 1          2
 *                   AggregationLayer[f, {n , n , …}] aggregates an array at levels n , n , ….
 * Usage:                                  1   2                                     1   2
 *
 *                   Input -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AggregationLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/AggregationLayer.html
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
fun aggregationLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AggregationLayer", arguments.toMutableList(), options)
}
