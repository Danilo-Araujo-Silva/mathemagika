package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GegenbauerC
 *
 * Full name:        System`GegenbauerC
 *
 *                                                                         (m)
 *                   GegenbauerC[n, m, x] gives the Gegenbauer polynomial C   (x).
 *                                                                         n
 *                                                                        (m)
 *                   GegenbauerC[n, x] gives the renormalized form  lim  C   (x)/m.
 * Usage:                                                          m  0  n
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GegenbauerC
 * Documentation:    web: http://reference.wolfram.com/language/ref/GegenbauerC.html
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
fun gegenbauerC(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GegenbauerC", arguments.toMutableList(), options)
}
