package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             InverseEllipticNomeQ
 *
 * Full name:        System`InverseEllipticNomeQ
 *
 * Usage:            InverseEllipticNomeQ[q] gives the parameter m corresponding to the nome q in an elliptic function.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseEllipticNomeQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseEllipticNomeQ.html
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
fun inverseEllipticNomeQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseEllipticNomeQ", arguments.toMutableList(), options)
}
