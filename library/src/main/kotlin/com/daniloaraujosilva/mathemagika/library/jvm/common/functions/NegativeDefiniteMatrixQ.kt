package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NegativeDefiniteMatrixQ
 *
 * Full name:        System`NegativeDefiniteMatrixQ
 *
 * Usage:            NegativeDefiniteMatrixQ[m] gives True if m is explicitly negative definite, and False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NegativeDefiniteMatrixQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/NegativeDefiniteMatrixQ.html
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
fun negativeDefiniteMatrixQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NegativeDefiniteMatrixQ", arguments.toMutableList(), options)
}
