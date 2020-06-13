package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Arrow
 *
 * Full name:        System`Arrow
 *
 *                   Arrow[{pt , pt }] is a graphics primitive that represents an arrow from pt  to pt .
 *                            1    2                                                           1      2
 *                   Arrow[{pt , pt }, s] represents an arrow with its ends set back from pt  and pt  by a distance s.
 *                            1    2                                                        1       2
 *                   Arrow[{pt , pt }, {s , s }] sets back by s  from pt  and s  from pt .
 *                            1    2     1   2                 1        1      2        2
 * Usage:            Arrow[curve, …] represents an arrow following the specified curve.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Arrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/Arrow.html
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
fun arrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Arrow", arguments.toMutableList(), options)
}
