package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CommonestFilter
 *
 * Full name:        System`CommonestFilter
 *
 *                   CommonestFilter[data, r] filters data by replacing every value by the mean value in its range-r neighborhood.
 *                                                                                  th
 *                   CommonestFilter[data, {r , r , …}] uses r  for filtering the i  dimension in data.
 * Usage:                                    1   2            i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CommonestFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/CommonestFilter.html
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
fun commonestFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CommonestFilter", arguments.toMutableList(), options)
}
