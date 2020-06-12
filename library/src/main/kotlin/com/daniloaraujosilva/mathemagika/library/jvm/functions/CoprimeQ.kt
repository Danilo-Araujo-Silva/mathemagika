package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CoprimeQ
 *
 * Full name:        System`CoprimeQ
 *
 *                   CoprimeQ[n , n ] yields True if n  and n  are relatively prime, and yields False otherwise.
 *                             1   2                  1      2
 *                   CoprimeQ[n , n , …] yields True if all pairs of the n  are relatively prime, and yields False otherwise.
 * Usage:                      1   2                                      i
 *
 * Options:          None
 *
 *                   Listable
 *                   Orderless
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CoprimeQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/CoprimeQ.html
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
fun coprimeQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CoprimeQ", arguments.toMutableList(), options)
}
