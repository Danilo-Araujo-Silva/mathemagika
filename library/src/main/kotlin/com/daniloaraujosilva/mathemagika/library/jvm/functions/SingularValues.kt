package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SingularValues
 *
 * Full name:        System`SingularValues
 *
 * Usage:            SingularValues[m] gives the singular value decomposition for a numerical matrix m. The result is a list {u, w, v}, where w is the list of singular values, and m can be written as Conjugate[Transpose[u]] . DiagonalMatrix[w] . v.
 *
 * Options:          Tolerance -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SingularValues
 * Documentation:    web: http://reference.wolfram.com/language/ref/SingularValues.html
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
fun singularValues(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SingularValues", arguments.toMutableList(), options)
}
