package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ArrayFlatten
 *
 * Full name:        System`ArrayFlatten
 *
 *                   ArrayFlatten[{{m  , m  , …}, {m  , m  , …}, …}] creates a single flattened matrix from a matrix of matrices m   .
 *                                   11   12        21   22                                                                       ij
 * Usage:            ArrayFlatten[a, r] flattens out r pairs of levels in the array a.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ArrayFlatten
 * Documentation:    web: http://reference.wolfram.com/language/ref/ArrayFlatten.html
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
fun arrayFlatten(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ArrayFlatten", arguments.toMutableList(), options)
}
