package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EllipticLog
 *
 * Full name:        System`EllipticLog
 *
 *                                                                                                                   2    3      2
 * Usage:            EllipticLog[{x, y}, {a, b}] gives the generalized logarithm associated with the elliptic curve y  = x  + a x  + b x.
 *
 * Options:          None
 *
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EllipticLog
 * Documentation:    web: http://reference.wolfram.com/language/ref/EllipticLog.html
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
fun ellipticLog(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EllipticLog", arguments.toMutableList(), options)
}
