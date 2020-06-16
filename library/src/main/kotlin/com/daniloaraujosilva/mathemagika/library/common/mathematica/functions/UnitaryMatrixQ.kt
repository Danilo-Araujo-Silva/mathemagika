package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             UnitaryMatrixQ
 *
 * Full name:        System`UnitaryMatrixQ
 *
 * Usage:            UnitaryMatrixQ[m] gives True if m is a unitary matrix, and False otherwise.
 *
 *                   Normalized -> True
 *                   SameTest -> Automatic
 * Options:          Tolerance -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/UnitaryMatrixQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnitaryMatrixQ.html
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
fun unitaryMatrixQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnitaryMatrixQ", arguments.toMutableList(), options)
}
