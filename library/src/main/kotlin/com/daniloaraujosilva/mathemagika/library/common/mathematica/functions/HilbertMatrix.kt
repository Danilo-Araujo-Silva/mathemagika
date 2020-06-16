package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             HilbertMatrix
 *
 * Full name:        System`HilbertMatrix
 *
 *                   HilbertMatrix[n] gives the n×n Hilbert matrix with elements of the form 1/(i + j - 1).
 * Usage:            HilbertMatrix[{m, n}] gives the m×n Hilbert matrix.
 *
 * Options:          WorkingPrecision -> Infinity
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/HilbertMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/HilbertMatrix.html
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
fun hilbertMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HilbertMatrix", arguments.toMutableList(), options)
}
