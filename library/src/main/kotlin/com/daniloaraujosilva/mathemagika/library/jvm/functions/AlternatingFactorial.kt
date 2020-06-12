package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AlternatingFactorial
 *
 * Full name:        System`AlternatingFactorial
 *
 * Usage:            AlternatingFactorial[n] gives the alternating factorial a(n).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AlternatingFactorial
 * Documentation:    web: http://reference.wolfram.com/language/ref/AlternatingFactorial.html
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
fun alternatingFactorial(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AlternatingFactorial", arguments.toMutableList(), options)
}
