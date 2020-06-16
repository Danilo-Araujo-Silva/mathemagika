package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Divisors
 *
 * Full name:        System`Divisors
 *
 * Usage:            Divisors[n] gives a list of the integers that divide n.
 *
 * Options:          GaussianIntegers -> False
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Divisors
 * Documentation:    web: http://reference.wolfram.com/language/ref/Divisors.html
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
fun divisors(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Divisors", arguments.toMutableList(), options)
}
