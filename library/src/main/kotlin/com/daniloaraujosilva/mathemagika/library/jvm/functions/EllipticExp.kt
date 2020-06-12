package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EllipticExp
 *
 * Full name:        System`EllipticExp
 *
 * Usage:            EllipticExp[u, {a, b}] is the inverse for EllipticLog. It produces a list {x, y} such that u == EllipticLog[{x, y}, {a, b}].
 *
 * Options:          None
 *
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EllipticExp
 * Documentation:    web: http://reference.wolfram.com/language/ref/EllipticExp.html
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
fun ellipticExp(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EllipticExp", arguments.toMutableList(), options)
}
