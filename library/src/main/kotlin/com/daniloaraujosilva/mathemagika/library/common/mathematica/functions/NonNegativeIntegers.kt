package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NonNegativeIntegers
 *
 * Full name:        System`NonNegativeIntegers
 *
 * Usage:            NonNegativeIntegers represents the domain of non-negative integers, as in x ∈ NonNegativeIntegers.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NonNegativeIntegers
 * Documentation:    web: http://reference.wolfram.com/language/ref/NonNegativeIntegers.html
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
fun nonNegativeIntegers(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NonNegativeIntegers", arguments.toMutableList(), options)
}
