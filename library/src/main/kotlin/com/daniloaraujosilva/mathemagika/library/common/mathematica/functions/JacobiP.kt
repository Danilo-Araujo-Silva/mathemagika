package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             JacobiP
 *
 * Full name:        System`JacobiP
 *
 *                                                                    (a, b)
 *                   JacobiP[n, a, b, x] gives the Jacobi polynomial P      (x).
 * Usage:                                                             n
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/JacobiP
 * Documentation:    web: http://reference.wolfram.com/language/ref/JacobiP.html
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
fun jacobiP(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("JacobiP", arguments.toMutableList(), options)
}
