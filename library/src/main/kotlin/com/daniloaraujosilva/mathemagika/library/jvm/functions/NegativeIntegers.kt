package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NegativeIntegers
 *
 * Full name:        System`NegativeIntegers
 *
 * Usage:            NegativeIntegers represents the domain of strictly negative integers, as in x ∈ NegativeIntegers.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NegativeIntegers
 * Documentation:    web: http://reference.wolfram.com/language/ref/NegativeIntegers.html
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
fun negativeIntegers(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NegativeIntegers", arguments.toMutableList(), options)
}
