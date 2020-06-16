package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             InverseJacobiNS
 *
 * Full name:        System`InverseJacobiNS
 *
 *                                                                                      -1
 * Usage:            InverseJacobiNS[v, m] gives the inverse Jacobi elliptic function ns  (v  m).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseJacobiNS
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseJacobiNS.html
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
fun inverseJacobiNS(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseJacobiNS", arguments.toMutableList(), options)
}
