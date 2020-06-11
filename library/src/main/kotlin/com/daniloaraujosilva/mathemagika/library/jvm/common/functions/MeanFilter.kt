package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MeanFilter
 *
 * Full name:        System`MeanFilter
 *
 *                   MeanFilter[data, r] filters data by replacing every value by the mean value in its range-r neighborhood.
 *                                                                             th
 *                   MeanFilter[data, {r , r , …}] uses r  for filtering the i  dimension in data.
 * Usage:                               1   2            i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MeanFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeanFilter.html
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
fun meanFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeanFilter", arguments.toMutableList(), options)
}
