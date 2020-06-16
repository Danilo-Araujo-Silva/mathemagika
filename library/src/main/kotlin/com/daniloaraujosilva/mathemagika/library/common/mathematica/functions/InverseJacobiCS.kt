package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             InverseJacobiCS
 *
 * Full name:        System`InverseJacobiCS
 *
 *                                                                                      -1
 * Usage:            InverseJacobiCS[v, m] gives the inverse Jacobi elliptic function cs  (v  m).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseJacobiCS
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseJacobiCS.html
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
fun inverseJacobiCS(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseJacobiCS", arguments.toMutableList(), options)
}
