package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DiagonalizableMatrixQ
 *
 * Full name:        System`DiagonalizableMatrixQ
 *
 * Usage:            DiagonalizableMatrixQ[m] gives True if m is diagonalizable, and False otherwise.
 *
 * Options:          Tolerance -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DiagonalizableMatrixQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiagonalizableMatrixQ.html
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
fun diagonalizableMatrixQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiagonalizableMatrixQ", arguments.toMutableList(), options)
}
