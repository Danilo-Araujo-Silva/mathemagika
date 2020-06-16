package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MinFilter
 *
 * Full name:        System`MinFilter
 *
 *                   MinFilter[data, r] filters data by replacing every value by the minimum value in its range-r neighborhood.
 *                                                                            th
 *                   MinFilter[data, {r , r , …}] uses r  for filtering the i  dimension in data.
 * Usage:                              1   2            i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MinFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/MinFilter.html
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
fun minFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MinFilter", arguments.toMutableList(), options)
}
