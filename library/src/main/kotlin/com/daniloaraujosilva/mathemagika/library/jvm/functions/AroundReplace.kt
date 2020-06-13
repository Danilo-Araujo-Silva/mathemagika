package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AroundReplace
 *
 * Full name:        System`AroundReplace
 *
 *                   AroundReplace[expr, {s   Around[x , δ ], s   Around[x , δ ], …}] propagates uncertainty in expr by replacing all occurrences of s  by Around[x , δ ].
 *                                         1           1   1    2           2   2                                                                       i            i   i
 * Usage:            AroundReplace[expr, rules, n] propagates uncertainty in expr using a series expansion to order n.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AroundReplace
 * Documentation:    web: http://reference.wolfram.com/language/ref/AroundReplace.html
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
fun aroundReplace(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AroundReplace", arguments.toMutableList(), options)
}
