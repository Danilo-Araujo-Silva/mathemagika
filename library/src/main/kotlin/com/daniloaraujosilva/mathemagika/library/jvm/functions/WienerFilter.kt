package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WienerFilter
 *
 * Full name:        System`WienerFilter
 *
 *                   WienerFilter[data, r] removes noise from data by applying a range-r Wiener filter.
 *                   WienerFilter[data, r, ns] assumes an additive noise power value ns.
 *                   WienerFilter[data, {r , r , …}, …] uses radius r  at level i in data.
 * Usage:                                 1   2                      i
 *
 * Options:          Padding -> Fixed
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WienerFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/WienerFilter.html
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
fun wienerFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WienerFilter", arguments.toMutableList(), options)
}
