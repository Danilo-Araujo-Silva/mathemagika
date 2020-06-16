package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             InverseJacobiND
 *
 * Full name:        System`InverseJacobiND
 *
 *                                                                                      -1
 * Usage:            InverseJacobiND[v, m] gives the inverse Jacobi elliptic function nd  (v  m).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseJacobiND
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseJacobiND.html
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
fun inverseJacobiND(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseJacobiND", arguments.toMutableList(), options)
}
