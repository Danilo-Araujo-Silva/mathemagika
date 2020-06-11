package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Resultant
 *
 * Full name:        System`Resultant
 *
 *                   Resultant[poly , poly , var] computes the resultant of the polynomials poly  and poly  with respect to the variable var.
 *                                 1      2                                                     1         2
 *                   Resultant[poly , poly , var, Modulus  p] computes the resultant modulo the prime p.
 * Usage:                          1      2
 *
 *                   Method -> Automatic
 * Options:          Modulus -> 0
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Resultant
 * Documentation:    web: http://reference.wolfram.com/language/ref/Resultant.html
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
fun resultant(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Resultant", arguments.toMutableList(), options)
}
