package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PauliMatrix
 *
 * Full name:        System`PauliMatrix
 *
 *                                              th
 *                   PauliMatrix[k] gives the k   Pauli spin matrix σ .
 * Usage:                                                             k
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PauliMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/PauliMatrix.html
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
fun pauliMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PauliMatrix", arguments.toMutableList(), options)
}
