package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UpperTriangularMatrixQ
 *
 * Full name:        System`UpperTriangularMatrixQ
 *
 *                   UpperTriangularMatrixQ[m] gives True if m is upper triangular, and False otherwise.
 *                                                                                                           th
 * Usage:            UpperTriangularMatrixQ[m, k] gives True if m is upper triangular starting up from the k   diagonal, and False otherwise.
 *
 *                   Tolerance -> Automatic
 * Options:          ZeroTest -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/UpperTriangularMatrixQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/UpperTriangularMatrixQ.html
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
fun upperTriangularMatrixQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UpperTriangularMatrixQ", arguments.toMutableList(), options)
}
