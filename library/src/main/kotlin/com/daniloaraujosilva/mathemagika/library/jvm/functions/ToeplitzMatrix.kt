package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ToeplitzMatrix
 *
 * Full name:        System`ToeplitzMatrix
 *
 *                   ToeplitzMatrix[n] gives the n×n Toeplitz matrix with first row and first column being successive integers.
 *                   ToeplitzMatrix[{c , c , …, c }] gives the Toeplitz matrix whose first column consists of elements c , c , ….
 *                                    1   2      n                                                                      1   2
 *                   ToeplitzMatrix[{c , c , …, c }, {r , r , …, r }] gives the Toeplitz matrix with elements c  down the first column, and r  across the first row.
 * Usage:                             1   2      m     1   2      n                                            i                             i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ToeplitzMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/ToeplitzMatrix.html
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
fun toeplitzMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ToeplitzMatrix", arguments.toMutableList(), options)
}
