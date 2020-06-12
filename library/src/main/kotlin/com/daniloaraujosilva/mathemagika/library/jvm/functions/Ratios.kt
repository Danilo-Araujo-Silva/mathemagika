package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Ratios
 *
 * Full name:        System`Ratios
 *
 *                   Ratios[list] gives the successive ratios of elements in list.
 *                                               th
 *                   Ratios[list, n] gives the n   iterated ratios of list.
 *                                                                     th
 *                   Ratios[list, {n , n , …}] gives the successive n    ratios at level k in a nested list.
 * Usage:                           1   2                            k
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Ratios
 * Documentation:    web: http://reference.wolfram.com/language/ref/Ratios.html
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
fun ratios(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Ratios", arguments.toMutableList(), options)
}
