package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NearestTo
 *
 * Full name:        System`NearestTo
 *
 *                   NearestTo[x] is an operator form that yields Nearest[elems, x] when applied to a list elems.
 *                   NearestTo[x, n] is an operator form that yields Nearest[elems, x, n] when applied to a list elems.
 * Usage:            NearestTo[x, {n, r}] is an operator form that yields Nearest[elems, x, {n, r}] when applied to a list elems.
 *
 *                   DistanceFunction -> Automatic
 *                   Method -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NearestTo
 * Documentation:    web: http://reference.wolfram.com/language/ref/NearestTo.html
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
fun nearestTo(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NearestTo", arguments.toMutableList(), options)
}
