package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Through
 *
 * Full name:        System`Through
 *
 *                   Through[p[f , f ][x]] gives p[f [x], f [x]].
 *                              1   2               1      2
 * Usage:            Through[expr, h] performs the transformation wherever h occurs in the head of expr.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Through
 * Documentation:    web: http://reference.wolfram.com/language/ref/Through.html
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
fun through(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Through", arguments.toMutableList(), options)
}
