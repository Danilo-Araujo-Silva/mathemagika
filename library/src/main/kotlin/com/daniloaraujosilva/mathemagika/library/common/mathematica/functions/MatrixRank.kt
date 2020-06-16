package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MatrixRank
 *
 * Full name:        System`MatrixRank
 *
 * Usage:            MatrixRank[m] gives the rank of the matrix m.
 *
 *                   Method -> Automatic
 *                   Modulus -> 0
 *                   Tolerance -> Automatic
 * Options:          ZeroTest -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MatrixRank
 * Documentation:    web: http://reference.wolfram.com/language/ref/MatrixRank.html
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
fun matrixRank(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MatrixRank", arguments.toMutableList(), options)
}
