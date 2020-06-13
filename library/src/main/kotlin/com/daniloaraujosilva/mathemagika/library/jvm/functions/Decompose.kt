package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Decompose
 *
 * Full name:        System`Decompose
 *
 * Usage:            Decompose[poly, x] decomposes a polynomial, if possible, into a composition of simpler polynomials.
 *
 * Options:          Modulus -> 0
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Decompose
 * Documentation:    web: http://reference.wolfram.com/language/ref/Decompose.html
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
fun decompose(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Decompose", arguments.toMutableList(), options)
}
