package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SingularValueList
 *
 * Full name:        System`SingularValueList
 *
 *                   SingularValueList[m] gives a list of the nonzero singular values of a matrix m.
 *                   SingularValueList[{m, a}] gives the generalized singular values of m with respect to a.
 *                   SingularValueList[m, k] gives the k largest singular values of m.
 * Usage:            SingularValueList[{m, a}, k] gives the k largest generalized singular values of m.
 *
 *                   Cubics -> False
 *                   Method -> Automatic
 *                   Quartics -> False
 * Options:          Tolerance -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SingularValueList
 * Documentation:    web: http://reference.wolfram.com/language/ref/SingularValueList.html
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
fun singularValueList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SingularValueList", arguments.toMutableList(), options)
}
