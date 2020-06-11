package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MaxFilter
 *
 * Full name:        System`MaxFilter
 *
 *                   MaxFilter[data, r] filters data by replacing every value by the maximum value in its range-r neighborhood.
 *                                                                            th
 *                   MaxFilter[data, {r , r , …}] uses r  for filtering the i  dimension in data.
 * Usage:                              1   2            i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MaxFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaxFilter.html
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
fun maxFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaxFilter", arguments.toMutableList(), options)
}
