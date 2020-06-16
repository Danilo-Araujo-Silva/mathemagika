package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SchurDecomposition
 *
 * Full name:        System`SchurDecomposition
 *
 *                   SchurDecomposition[m] yields the Schur decomposition for a numerical matrix m, given as a list {q, t} where q is an orthonormal matrix and t is a block upper‐triangular matrix.
 * Usage:            SchurDecomposition[{m, a}] gives the generalized Schur decomposition of m with respect to a.
 *
 *                   Pivoting -> False
 * Options:          RealBlockDiagonalForm -> True
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SchurDecomposition
 * Documentation:    web: http://reference.wolfram.com/language/ref/SchurDecomposition.html
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
fun schurDecomposition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SchurDecomposition", arguments.toMutableList(), options)
}
