package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DiagonalMatrixQ
 *
 * Full name:        System`DiagonalMatrixQ
 *
 *                   DiagonalMatrixQ[m] gives True if m is diagonal, and False otherwise.
 *                                                                                            th
 * Usage:            DiagonalMatrixQ[m, k] gives True if m has nonzero elements only on the k   diagonal, and False otherwise.
 *
 *                   Tolerance -> Automatic
 * Options:          ZeroTest -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DiagonalMatrixQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiagonalMatrixQ.html
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
fun diagonalMatrixQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiagonalMatrixQ", arguments.toMutableList(), options)
}
