package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UpperTriangularize
 *
 * Full name:        System`UpperTriangularize
 *
 *                   UpperTriangularize[m] gives a matrix in which all but the upper triangular elements of m are replaced with zeros.
 *                                                                                              th
 * Usage:            UpperTriangularize[m, k] replaces with zeros only the elements below the k   subdiagonal of m.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/UpperTriangularize
 * Documentation:    web: http://reference.wolfram.com/language/ref/UpperTriangularize.html
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
fun upperTriangularize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UpperTriangularize", arguments.toMutableList(), options)
}
