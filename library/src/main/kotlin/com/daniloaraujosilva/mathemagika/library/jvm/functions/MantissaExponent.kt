package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MantissaExponent
 *
 * Full name:        System`MantissaExponent
 *
 *                   MantissaExponent[x] gives a list containing the mantissa and exponent of a number x.
 * Usage:            MantissaExponent[x, b] gives the base‐b mantissa and exponent of x.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MantissaExponent
 * Documentation:    web: http://reference.wolfram.com/language/ref/MantissaExponent.html
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
fun mantissaExponent(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MantissaExponent", arguments.toMutableList(), options)
}
