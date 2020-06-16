package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             InverseJacobiSC
 *
 * Full name:        System`InverseJacobiSC
 *
 *                                                                                      -1
 * Usage:            InverseJacobiSC[v, m] gives the inverse Jacobi elliptic function sc  (v  m).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseJacobiSC
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseJacobiSC.html
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
fun inverseJacobiSC(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseJacobiSC", arguments.toMutableList(), options)
}
