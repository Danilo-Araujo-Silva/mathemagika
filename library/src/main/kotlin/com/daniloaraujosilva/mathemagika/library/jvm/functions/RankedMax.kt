package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RankedMax
 *
 * Full name:        System`RankedMax
 *
 *                                                  th
 *                   RankedMax[list, n] gives the n   largest element in list.
 *                                                   th
 * Usage:            RankedMax[list, -n] gives the n   smallest element in list.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RankedMax
 * Documentation:    web: http://reference.wolfram.com/language/ref/RankedMax.html
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
fun rankedMax(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RankedMax", arguments.toMutableList(), options)
}
