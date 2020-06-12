package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PrimePi
 *
 * Full name:        System`PrimePi
 *
 * Usage:            PrimePi[x] gives the number of primes π(x) less than or equal to x.
 *
 * Options:          Method -> Automatic
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PrimePi
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrimePi.html
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
fun primePi(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrimePi", arguments.toMutableList(), options)
}
