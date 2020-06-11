package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MeijerG
 *
 * Full name:        System`MeijerG
 *
 *                                                                                                                        mn
 *                   MeijerG[{{a , …, a }, {a     , …, a }}, {{b , …, b }, {b     , …, b }}, z] is the Meijer G function G  (z  a , …, a ).
 *                              1      n     n + 1      p       1      m     m + 1      q                                 pq      1      p
 *
 *                                                                                                                               b , …, b
 * Usage:                                                                                                                         1      q
 *
 * Options:          None
 *
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MeijerG
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeijerG.html
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
fun meijerG(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeijerG", arguments.toMutableList(), options)
}
