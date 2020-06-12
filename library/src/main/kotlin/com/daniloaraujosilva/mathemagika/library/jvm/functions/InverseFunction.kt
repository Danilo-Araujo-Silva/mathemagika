package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InverseFunction
 *
 * Full name:        System`InverseFunction
 *
 *                   InverseFunction[f] represents the inverse of the function f, defined so that InverseFunction[f][y] gives the value of x for which f[x] is equal to y.
 *                                                                                            th
 * Usage:            InverseFunction[f, n, tot] represents the inverse with respect to the n   argument when there are tot arguments in all.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseFunction.html
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
fun inverseFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseFunction", arguments.toMutableList(), options)
}
