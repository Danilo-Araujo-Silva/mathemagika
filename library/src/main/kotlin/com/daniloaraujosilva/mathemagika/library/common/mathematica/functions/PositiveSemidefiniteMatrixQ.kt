package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PositiveSemidefiniteMatrixQ
 *
 * Full name:        System`PositiveSemidefiniteMatrixQ
 *
 * Usage:            PositiveSemidefiniteMatrixQ[m] gives True if m is explicitly positive semidefinite, and False otherwise.
 *
 * Options:          Tolerance -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PositiveSemidefiniteMatrixQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/PositiveSemidefiniteMatrixQ.html
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
fun positiveSemidefiniteMatrixQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PositiveSemidefiniteMatrixQ", arguments.toMutableList(), options)
}
