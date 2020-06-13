package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ReplicateLayer
 *
 * Full name:        System`ReplicateLayer
 *
 *                   ReplicateLayer[n] represents a net layer that takes an input of dimensions {d , d , …} and replicates it n times to produce an output of dimensions {n, d , d , …}.
 *                                                                                                1   2                                                                       1   2
 *                   ReplicateLayer[{n , n , …, n }] represents a net layer that takes an input of dimensions {d , d , …} and replicates it to produce an output of dimensions {n , n , …, n , d , d , …}.
 *                                    1   2      m                                                              1   2                                                            1   2      m   1   2
 * Usage:            ReplicateLayer[dims, m] replicates so that dims appears at position m in the list of output dimensions.
 *
 *                   Input -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ReplicateLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReplicateLayer.html
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
fun replicateLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReplicateLayer", arguments.toMutableList(), options)
}
