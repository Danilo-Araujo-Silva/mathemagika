package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RangeFilter
 *
 * Full name:        System`RangeFilter
 *
 *                   RangeFilter[data, r] filters data by replacing every value by the difference of the maximum and minimum in its range-r neighborhood.
 *                                                                              th
 *                   RangeFilter[data, {r , r , …}] uses r  for filtering the i  dimension in data.
 * Usage:                                1   2            i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RangeFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/RangeFilter.html
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
fun rangeFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RangeFilter", arguments.toMutableList(), options)
}
