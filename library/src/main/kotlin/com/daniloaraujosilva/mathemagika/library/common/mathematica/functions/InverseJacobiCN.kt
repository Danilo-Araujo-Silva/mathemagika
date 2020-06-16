package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             InverseJacobiCN
 *
 * Full name:        System`InverseJacobiCN
 *
 *                                                                                      -1
 * Usage:            InverseJacobiCN[v, m] gives the inverse Jacobi elliptic function cn  (v  m).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseJacobiCN
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseJacobiCN.html
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
fun inverseJacobiCN(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseJacobiCN", arguments.toMutableList(), options)
}
