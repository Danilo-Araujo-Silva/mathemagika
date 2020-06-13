package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DiagonalMatrix
 *
 * Full name:        System`DiagonalMatrix
 *
 *                   DiagonalMatrix[list] gives a matrix with the elements of list on the leading diagonal, and 0 elsewhere.
 *                                                                                             th
 *                   DiagonalMatrix[list, k] gives a matrix with the elements of list on the k   diagonal.
 * Usage:            DiagonalMatrix[list, k, n] pads with 0s to create an n×n matrix.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DiagonalMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiagonalMatrix.html
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
fun diagonalMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiagonalMatrix", arguments.toMutableList(), options)
}
