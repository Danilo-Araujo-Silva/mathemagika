package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             OrthogonalMatrixQ
 *
 * Full name:        System`OrthogonalMatrixQ
 *
 * Usage:            OrthogonalMatrixQ[m] gives True if m is an explicitly orthogonal matrix, and False otherwise.
 *
 *                   Normalized -> True
 *                   SameTest -> Automatic
 * Options:          Tolerance -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/OrthogonalMatrixQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/OrthogonalMatrixQ.html
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
fun orthogonalMatrixQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OrthogonalMatrixQ", arguments.toMutableList(), options)
}
