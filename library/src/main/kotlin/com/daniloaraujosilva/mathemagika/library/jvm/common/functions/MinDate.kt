package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MinDate
 *
 * Full name:        System`MinDate
 *
 *                   MinDate[{date , date , …}] gives the earliest date of the date .
 *                                1      2                                         i
 *                   MinDate[interval] gives the beginning of the date interval interval.
 * Usage:            MinDate[interval, gran] gives the beginning of interval as specified by granularity gran.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MinDate
 * Documentation:    web: http://reference.wolfram.com/language/ref/MinDate.html
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
fun minDate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MinDate", arguments.toMutableList(), options)
}
