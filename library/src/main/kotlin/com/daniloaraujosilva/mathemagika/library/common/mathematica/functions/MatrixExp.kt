package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MatrixExp
 *
 * Full name:        System`MatrixExp
 *
 *                   MatrixExp[m] gives the matrix exponential of m.
 * Usage:            MatrixExp[m, v] gives the matrix exponential of m applied to the vector v.
 *
 *                   Method -> Automatic
 * Options:          Parameter -> 1
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MatrixExp
 * Documentation:    web: http://reference.wolfram.com/language/ref/MatrixExp.html
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
fun matrixExp(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MatrixExp", arguments.toMutableList(), options)
}
