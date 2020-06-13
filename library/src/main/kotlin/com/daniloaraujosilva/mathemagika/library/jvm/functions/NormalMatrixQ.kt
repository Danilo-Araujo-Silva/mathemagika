package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NormalMatrixQ
 *
 * Full name:        System`NormalMatrixQ
 *
 * Usage:            NormalMatrixQ[m] gives True if m is an explicitly normal matrix, and False otherwise.
 *
 *                   SameTest -> Automatic
 * Options:          Tolerance -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NormalMatrixQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/NormalMatrixQ.html
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
fun normalMatrixQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NormalMatrixQ", arguments.toMutableList(), options)
}
