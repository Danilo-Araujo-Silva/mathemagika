package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Cashflow
 *
 * Full name:        System`Cashflow
 *
 *                   Cashflow[{c , c , …, c }] represents a series of cash flows occurring at unit time intervals.
 *                              0   1      n
 *                   Cashflow[{c , c , …, c }, q] represents cash flows occurring at time intervals q.
 *                              0   1      n
 *                   Cashflow[{{time , c }, {time , c }, …}] represents cash flows occurring at the specified times.
 * Usage:                           1   1        2   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Cashflow
 * Documentation:    web: http://reference.wolfram.com/language/ref/Cashflow.html
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
fun cashflow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Cashflow", arguments.toMutableList(), options)
}
