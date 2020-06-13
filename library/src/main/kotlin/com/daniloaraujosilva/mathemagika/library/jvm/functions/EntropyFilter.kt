package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EntropyFilter
 *
 * Full name:        System`EntropyFilter
 *
 *                   EntropyFilter[data, r] filters data by replacing every value by the entropy value in its range-r neighborhood.
 *                                                                                th
 *                   EntropyFilter[data, {r , r , …}] uses r  for filtering the i  dimension in data.
 * Usage:                                  1   2            i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EntropyFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/EntropyFilter.html
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
fun entropyFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EntropyFilter", arguments.toMutableList(), options)
}
