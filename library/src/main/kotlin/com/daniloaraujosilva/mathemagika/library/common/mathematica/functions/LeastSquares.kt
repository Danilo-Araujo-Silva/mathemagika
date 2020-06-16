package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LeastSquares
 *
 * Full name:        System`LeastSquares
 *
 * Usage:            LeastSquares[m, b] finds an x that solves the linear least-squares problem for the matrix equation m . x == b.
 *
 *                   Method -> Automatic
 * Options:          Tolerance -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LeastSquares
 * Documentation:    web: http://reference.wolfram.com/language/ref/LeastSquares.html
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
fun leastSquares(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeastSquares", arguments.toMutableList(), options)
}
