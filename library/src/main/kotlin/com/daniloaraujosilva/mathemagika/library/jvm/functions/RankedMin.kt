package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RankedMin
 *
 * Full name:        System`RankedMin
 *
 *                                                  th
 *                   RankedMin[list, n] gives the n   smallest element in list.
 *                                                   th
 * Usage:            RankedMin[list, -n] gives the n   largest element in list.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RankedMin
 * Documentation:    web: http://reference.wolfram.com/language/ref/RankedMin.html
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
fun rankedMin(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RankedMin", arguments.toMutableList(), options)
}
