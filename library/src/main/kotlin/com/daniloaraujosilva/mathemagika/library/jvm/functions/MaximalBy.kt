package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MaximalBy
 *
 * Full name:        System`MaximalBy
 *
 *                   MaximalBy[{e , e , …}, f] returns a list of the e  for which the value of f[e ] is maximal.
 *                               1   2                                i                           i
 *                   MaximalBy[{e , e , …}, f, n] returns a list of the e  corresponding to the n largest f[e ].
 *                               1   2                                   i                                   i
 * Usage:            MaximalBy[f] represents an operator form of MaximalBy that can be applied to an expression.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MaximalBy
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaximalBy.html
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
fun maximalBy(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaximalBy", arguments.toMutableList(), options)
}
