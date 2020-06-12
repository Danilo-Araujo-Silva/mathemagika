package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StandardDeviationFilter
 *
 * Full name:        System`StandardDeviationFilter
 *
 *                   StandardDeviationFilter[data, r] filters data by replacing every value by the standard deviations of the values in its range-r neighborhood.
 *                                                                                          th
 *                   StandardDeviationFilter[data, {r , r , …}] uses r  for filtering the i  dimension in data.
 * Usage:                                            1   2            i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StandardDeviationFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/StandardDeviationFilter.html
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
fun standardDeviationFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StandardDeviationFilter", arguments.toMutableList(), options)
}
