package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             HermitianMatrixQ
 *
 * Full name:        System`HermitianMatrixQ
 *
 * Usage:            HermitianMatrixQ[m] gives True if m is explicitly Hermitian, and False otherwise.
 *
 *                   SameTest -> Automatic
 * Options:          Tolerance -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/HermitianMatrixQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/HermitianMatrixQ.html
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
fun hermitianMatrixQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HermitianMatrixQ", arguments.toMutableList(), options)
}
