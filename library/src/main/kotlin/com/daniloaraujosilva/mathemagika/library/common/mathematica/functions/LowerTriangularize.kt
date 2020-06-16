package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LowerTriangularize
 *
 * Full name:        System`LowerTriangularize
 *
 *                   LowerTriangularize[m] gives a matrix in which all but the lower triangular elements of m are replaced with zeros.
 *                                                                                              th
 * Usage:            LowerTriangularize[m, k] replaces with zeros only the elements above the k   subdiagonal of m.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LowerTriangularize
 * Documentation:    web: http://reference.wolfram.com/language/ref/LowerTriangularize.html
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
fun lowerTriangularize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LowerTriangularize", arguments.toMutableList(), options)
}
