package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CycleIndexPolynomial
 *
 * Full name:        System`CycleIndexPolynomial
 *
 *                   CycleIndexPolynomial[perm, {x , …, x }] constructs the cycle index monomial of the permutation perm in the variables x .
 *                                                1      n                                                                                 i
 *                   CycleIndexPolynomial[group, {x , …, x }] constructs the cycle index polynomial of group in the variables x .
 * Usage:                                          1      n                                                                    i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CycleIndexPolynomial
 * Documentation:    web: http://reference.wolfram.com/language/ref/CycleIndexPolynomial.html
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
fun cycleIndexPolynomial(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CycleIndexPolynomial", arguments.toMutableList(), options)
}
