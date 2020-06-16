package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MonomialList
 *
 * Full name:        System`MonomialList
 *
 *                   MonomialList[poly] gives the list of all monomials in the polynomial poly.
 *                   MonomialList[poly, {x , x , …}] gives the list of monomials with respect to the variables x  in poly.
 *                                        1   2                                                                 i
 *                   MonomialList[poly, {x , x , …}, order] puts the monomials in the specified order.
 * Usage:                                 1   2
 *
 * Options:          Modulus -> 0
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MonomialList
 * Documentation:    web: http://reference.wolfram.com/language/ref/MonomialList.html
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
fun monomialList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MonomialList", arguments.toMutableList(), options)
}
