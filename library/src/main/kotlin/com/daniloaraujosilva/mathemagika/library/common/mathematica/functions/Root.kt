package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Root
 *
 * Full name:        System`Root
 *
 *                                                     th
 *                   Root[f, k] represents the exact k   root of the polynomial equation f[x]  0.
 *                                                                                                                                        th
 *                   Root[{f , f , …}, {k , k , …}] represents the last coordinate of the exact vector {a , a , …} such that a  is the k    root of the polynomial equation f [a , …, a     , x]  0.
 *                          1   2        1   2                                                           1   2                i         i                                     i  1      i - 1
 *                   Root[{f, x }] represents the exact root of the general equation f[x]  0 near x = x .
 *                             0                                                                        0
 *                   Root[{f, x , n}] represents n roots of the equation f[x]  0 near x = x .
 * Usage:                      0                                                            0
 *
 * Options:          ExactRootIsolation -> False
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Root
 * Documentation:    web: http://reference.wolfram.com/language/ref/Root.html
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
fun root(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Root", arguments.toMutableList(), options)
}
