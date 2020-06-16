package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LowerTriangularMatrixQ
 *
 * Full name:        System`LowerTriangularMatrixQ
 *
 *                   LowerTriangularMatrixQ[m] gives True if m is lower triangular, and False otherwise.
 *                                                                                                             th
 * Usage:            LowerTriangularMatrixQ[m, k] gives True if m is lower triangular starting down from the k   diagonal, and False otherwise.
 *
 *                   Tolerance -> Automatic
 * Options:          ZeroTest -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LowerTriangularMatrixQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/LowerTriangularMatrixQ.html
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
fun lowerTriangularMatrixQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LowerTriangularMatrixQ", arguments.toMutableList(), options)
}
