package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Apart
 *
 * Full name:        System`Apart
 *
 *                   Apart[expr] rewrites a rational expression as a sum of terms with minimal denominators.
 * Usage:            Apart[expr, var] treats all variables other than var as constants.
 *
 *                   Modulus -> 0
 * Options:          Trig -> False
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Apart
 * Documentation:    web: http://reference.wolfram.com/language/ref/Apart.html
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
fun apart(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Apart", arguments.toMutableList(), options)
}
