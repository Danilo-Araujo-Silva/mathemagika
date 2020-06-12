package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MultiplicativeOrder
 *
 * Full name:        System`MultiplicativeOrder
 *
 *                                                                                                                                        m
 *                   MultiplicativeOrder[k, n] gives the multiplicative order of k modulo n, defined as the smallest integer m such that k  ≡ 1mod n.
 *                                                                                                                                                                 m
 *                   MultiplicativeOrder[k, n, {r , r , …}] gives the generalized multiplicative order of k modulo n, defined as the smallest integer m such that k  ≡ r  mod n for some i.
 * Usage:                                        1   2                                                                                                                  i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MultiplicativeOrder
 * Documentation:    web: http://reference.wolfram.com/language/ref/MultiplicativeOrder.html
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
fun multiplicativeOrder(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MultiplicativeOrder", arguments.toMutableList(), options)
}
