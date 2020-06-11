package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EllipticNomeQ
 *
 * Full name:        System`EllipticNomeQ
 *
 * Usage:            EllipticNomeQ[m] gives the nome q corresponding to the parameter m in an elliptic function.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EllipticNomeQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/EllipticNomeQ.html
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
fun ellipticNomeQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EllipticNomeQ", arguments.toMutableList(), options)
}
