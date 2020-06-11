package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PositiveDefiniteMatrixQ
 *
 * Full name:        System`PositiveDefiniteMatrixQ
 *
 * Usage:            PositiveDefiniteMatrixQ[m] gives True if m is explicitly positive definite, and False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PositiveDefiniteMatrixQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/PositiveDefiniteMatrixQ.html
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
fun positiveDefiniteMatrixQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PositiveDefiniteMatrixQ", arguments.toMutableList(), options)
}
