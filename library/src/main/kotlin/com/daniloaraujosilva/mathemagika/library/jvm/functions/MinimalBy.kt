package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MinimalBy
 *
 * Full name:        System`MinimalBy
 *
 *                   MinimalBy[{e , e , …}, f] returns a list of the e  for which the value of f[e ] is minimal.
 *                               1   2                                i                           i
 *                   MinimalBy[{e , e , …}, f, n] returns a list of the e  corresponding to the n smallest f[e ].
 *                               1   2                                   i                                    i
 * Usage:            MinimalBy[f] represents an operator form of MinimalBy that can be applied to an expression.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MinimalBy
 * Documentation:    web: http://reference.wolfram.com/language/ref/MinimalBy.html
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
fun minimalBy(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MinimalBy", arguments.toMutableList(), options)
}
