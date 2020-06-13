package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ChineseRemainder
 *
 * Full name:        System`ChineseRemainder
 *
 *                   ChineseRemainder[{r , r , …}, {m , m , …}] gives the smallest x with x ≥ 0 that satisfies all the integer congruences x mod m   r  mod m .
 *                                      1   2        1   2                                                                                        i    i      i
 *                   ChineseRemainder[{r , r , …}, {m , m , …}, d] gives the smallest x with x ≥ d that satisfies all the integer congruences x mod m   r  mod m .
 * Usage:                               1   2        1   2                                                                                           i    i      i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ChineseRemainder
 * Documentation:    web: http://reference.wolfram.com/language/ref/ChineseRemainder.html
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
fun chineseRemainder(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ChineseRemainder", arguments.toMutableList(), options)
}
