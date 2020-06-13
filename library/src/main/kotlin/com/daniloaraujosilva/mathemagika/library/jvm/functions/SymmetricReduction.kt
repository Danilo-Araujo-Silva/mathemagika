package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SymmetricReduction
 *
 * Full name:        System`SymmetricReduction
 *
 *                   SymmetricReduction[f, {x , …, x }] gives a pair of polynomials {p, q} in x , …, x  such that f == p + q, where p is the symmetric part and q is the remainder.
 *                                           1      n                                          1      n
 *                   SymmetricReduction[f, {x , …, x }, {s , …, s }] gives the pair {p, q} with the elementary symmetric polynomials in p replaced by s , …, s .
 * Usage:                                    1      n     1      n                                                                                     1      n
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SymmetricReduction
 * Documentation:    web: http://reference.wolfram.com/language/ref/SymmetricReduction.html
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
fun symmetricReduction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SymmetricReduction", arguments.toMutableList(), options)
}
