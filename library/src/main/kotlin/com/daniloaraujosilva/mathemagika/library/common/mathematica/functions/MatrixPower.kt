package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MatrixPower
 *
 * Full name:        System`MatrixPower
 *
 *                                                  th
 *                   MatrixPower[m, n] gives the n   matrix power of the matrix m.
 *                                                    th
 * Usage:            MatrixPower[m, n, v] gives the n   matrix power of the matrix m applied to the vector v.
 *
 * Options:          Method -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MatrixPower
 * Documentation:    web: http://reference.wolfram.com/language/ref/MatrixPower.html
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
fun matrixPower(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MatrixPower", arguments.toMutableList(), options)
}
