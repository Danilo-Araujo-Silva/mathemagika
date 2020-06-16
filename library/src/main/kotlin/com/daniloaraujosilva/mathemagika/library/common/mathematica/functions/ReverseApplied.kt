package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ReverseApplied
 *
 * Full name:        System`ReverseApplied
 *
 *                   ReverseApplied[f] represents a form of f that takes arguments in reverse order so that ReverseApplied[f][x , …, x ] is equivalent to f[x , …, x ].
 *                                                                                                                             1      n                      n      1
 * Usage:            ReverseApplied[f, n] represents a form of f that reverses the first n arguments before evaluation.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ReverseApplied
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReverseApplied.html
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
fun reverseApplied(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReverseApplied", arguments.toMutableList(), options)
}
