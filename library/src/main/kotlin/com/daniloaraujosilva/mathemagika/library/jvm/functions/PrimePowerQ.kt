package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PrimePowerQ
 *
 * Full name:        System`PrimePowerQ
 *
 * Usage:            PrimePowerQ[expr] yields True if expr is a power of a prime number, and yields False otherwise.
 *
 * Options:          GaussianIntegers -> Automatic
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PrimePowerQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrimePowerQ.html
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
fun primePowerQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrimePowerQ", arguments.toMutableList(), options)
}
