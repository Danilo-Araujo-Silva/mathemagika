package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PositiveIntegers
 *
 * Full name:        System`PositiveIntegers
 *
 * Usage:            PositiveIntegers represents the domain of strictly positive integers, as in x ∈ PositiveIntegers.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PositiveIntegers
 * Documentation:    web: http://reference.wolfram.com/language/ref/PositiveIntegers.html
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
fun positiveIntegers(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PositiveIntegers", arguments.toMutableList(), options)
}
