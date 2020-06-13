package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ApartSquareFree
 *
 * Full name:        System`ApartSquareFree
 *
 *                   ApartSquareFree[expr] rewrites a rational expression as a sum of terms whose denominators are powers of square-free polynomials.
 * Usage:            ApartSquareFree[expr, var] treats all variables other than var as constants.
 *
 *                   Modulus -> 0
 * Options:          Trig -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ApartSquareFree
 * Documentation:    web: http://reference.wolfram.com/language/ref/ApartSquareFree.html
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
fun apartSquareFree(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ApartSquareFree", arguments.toMutableList(), options)
}
