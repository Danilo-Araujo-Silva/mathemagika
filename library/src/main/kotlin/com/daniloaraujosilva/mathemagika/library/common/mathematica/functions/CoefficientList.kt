package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CoefficientList
 *
 * Full name:        System`CoefficientList
 *
 *                   CoefficientList[poly, var] gives a list of coefficients of powers of var in poly, starting with power 0.
 *                   CoefficientList[poly, {var , var , …}] gives an array of coefficients of the var .
 *                                             1     2                                               i
 *                   CoefficientList[poly, {var , var , …}, {dim , dim , …}] gives an array of dimensions {dim , dim , …}, truncating or padding with zeros as needed.
 * Usage:                                      1     2          1     2                                       1     2
 *
 * Options:          Modulus -> 0
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CoefficientList
 * Documentation:    web: http://reference.wolfram.com/language/ref/CoefficientList.html
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
fun coefficientList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CoefficientList", arguments.toMutableList(), options)
}
