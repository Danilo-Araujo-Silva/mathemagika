package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DiscreteDelta
 *
 * Full name:        System`DiscreteDelta
 *
 *                   DiscreteDelta[n , n , …] gives the discrete delta function δ (n , n , …), equal to 1 if all the n  are zero, and 0 otherwise.
 * Usage:                           1   2                                           1   2                             i
 *
 * Options:          None
 *
 *                   NumericFunction
 *                   Orderless
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DiscreteDelta
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiscreteDelta.html
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
fun discreteDelta(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiscreteDelta", arguments.toMutableList(), options)
}
