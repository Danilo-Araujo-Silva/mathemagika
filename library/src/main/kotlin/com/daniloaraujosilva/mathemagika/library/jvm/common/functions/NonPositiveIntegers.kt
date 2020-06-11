package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NonPositiveIntegers
 *
 * Full name:        System`NonPositiveIntegers
 *
 * Usage:            NonPositiveIntegers represents the domain of non-positive integers, as in x ∈ NonPositiveIntegers.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NonPositiveIntegers
 * Documentation:    web: http://reference.wolfram.com/language/ref/NonPositiveIntegers.html
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
fun nonPositiveIntegers(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NonPositiveIntegers", arguments.toMutableList(), options)
}
