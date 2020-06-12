package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SymmetricMatrixQ
 *
 * Full name:        System`SymmetricMatrixQ
 *
 * Usage:            SymmetricMatrixQ[m] gives True if m is explicitly symmetric, and False otherwise.
 *
 *                   SameTest -> Automatic
 * Options:          Tolerance -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SymmetricMatrixQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/SymmetricMatrixQ.html
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
fun symmetricMatrixQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SymmetricMatrixQ", arguments.toMutableList(), options)
}
