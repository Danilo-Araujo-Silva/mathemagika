package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NegativeSemidefiniteMatrixQ
 *
 * Full name:        System`NegativeSemidefiniteMatrixQ
 *
 * Usage:            NegativeSemidefiniteMatrixQ[m] gives True if m is explicitly negative semidefinite, and False otherwise.
 *
 * Options:          Tolerance -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NegativeSemidefiniteMatrixQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/NegativeSemidefiniteMatrixQ.html
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
fun negativeSemidefiniteMatrixQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NegativeSemidefiniteMatrixQ", arguments.toMutableList(), options)
}
