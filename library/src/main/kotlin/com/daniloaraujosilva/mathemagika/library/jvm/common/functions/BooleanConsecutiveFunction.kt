package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BooleanConsecutiveFunction
 *
 * Full name:        System`BooleanConsecutiveFunction
 *
 *                   BooleanConsecutiveFunction[k, n] represents a Boolean function of n variables that gives True if k consecutive variables are True.
 *                   BooleanConsecutiveFunction[{k, True}, n] treats the variable list as cyclic.
 *                   BooleanConsecutiveFunction[{k , k , …, k }, {n , n , …, n }] represents a Boolean function of n  n  ⋯ n  variables that gives True if all variables in a k   k   …  k  block of the n   n   …  n  variable array are True.
 *                                                1   2      d     1   2      d                                     1  2    d                                                  1    2        d               1    2        d
 *                                                                                                                th
 *                   BooleanConsecutiveFunction[{{k , k , …, k }, {c , c , …, c }}, {n , n , …, n }] treats the i   level of the variable array as cyclic if c  is True.
 *                                                 1   2      d     1   2      d      1   2      d                                                             i
 *                   BooleanConsecutiveFunction[spec, {a , a , …}] gives the Boolean expression in variables a  corresponding to the Boolean consecutive function specified by spec.
 *                                                      1   2                                                 i
 *                   BooleanConsecutiveFunction[spec, {a , a , …}, form] gives the Boolean expression in the form specified by form.
 * Usage:                                               1   2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BooleanConsecutiveFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/BooleanConsecutiveFunction.html
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
fun booleanConsecutiveFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BooleanConsecutiveFunction", arguments.toMutableList(), options)
}
