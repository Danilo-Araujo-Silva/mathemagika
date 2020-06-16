package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MatrixQ
 *
 * Full name:        System`MatrixQ
 *
 *                   MatrixQ[expr] gives True if expr is a list of lists or a two-dimensional SparseArray object that can represent a matrix, and gives False otherwise.
 * Usage:            MatrixQ[expr, test] gives True only if test yields True when applied to each of the matrix elements in expr.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MatrixQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/MatrixQ.html
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
fun matrixQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MatrixQ", arguments.toMutableList(), options)
}
