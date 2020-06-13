package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Expand
 *
 * Full name:        System`Expand
 *
 *                   Expand[expr] expands out products and positive integer powers in expr.
 * Usage:            Expand[expr, patt] leaves unexpanded any parts of expr that are free of the pattern patt.
 *
 *                   Modulus -> 0
 * Options:          Trig -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Expand
 * Documentation:    web: http://reference.wolfram.com/language/ref/Expand.html
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
fun expand(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Expand", arguments.toMutableList(), options)
}
