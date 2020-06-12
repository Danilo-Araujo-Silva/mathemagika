package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Min
 *
 * Full name:        System`Min
 *
 *                   Min[x , x , …] yields the numerically smallest of the x .
 *                        1   2                                             i
 *                   Min[{x , x , …}, {y , …}, …] yields the smallest element of any of the lists.
 * Usage:                  1   2        1
 *
 * Options:          None
 *
 *                   Flat
 *                   NumericFunction
 *                   OneIdentity
 *                   Orderless
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Min
 * Documentation:    web: http://reference.wolfram.com/language/ref/Min.html
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
fun min(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Min", arguments.toMutableList(), options)
}
