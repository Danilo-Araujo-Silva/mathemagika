package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SquareMatrixQ
 *
 * Full name:        System`SquareMatrixQ
 *
 * Usage:            SquareMatrixQ[m] gives True if m is a square matrix, and False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SquareMatrixQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/SquareMatrixQ.html
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
fun squareMatrixQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SquareMatrixQ", arguments.toMutableList(), options)
}
