package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ExpandNumerator
 *
 * Full name:        System`ExpandNumerator
 *
 * Usage:            ExpandNumerator[expr] expands out products and powers that appear in the numerator of expr.
 *
 *                   Modulus -> 0
 * Options:          Trig -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ExpandNumerator
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExpandNumerator.html
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
fun expandNumerator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExpandNumerator", arguments.toMutableList(), options)
}
