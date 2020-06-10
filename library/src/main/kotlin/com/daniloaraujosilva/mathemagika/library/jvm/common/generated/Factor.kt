package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Factor
 * 
 * Full name:        System`Factor
 * 
 *                   Factor[poly] factors a polynomial over the integers. 
 *                   Factor[poly, Modulus  p] factors a polynomial modulo a prime p. 
 *                   Factor[poly, Extension  {a , a , …}] factors a polynomial allowing coefficients that are rational combinations of the algebraic numbers a . 
 * Usage:                                       1   2                                                                                                          i
 * 
 *                   Extension -> None
 *                   GaussianIntegers -> False
 *                   Modulus -> 0
 * Options:          Trig -> False
 * 
 *                   Listable
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Factor
 * Documentation:    web: http://reference.wolfram.com/language/ref/Factor.html
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
fun factor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Factor", arguments.toMutableList(), options)
}
