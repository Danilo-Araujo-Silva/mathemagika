package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PositiveRationals
 *
 * Full name:        System`PositiveRationals
 *
 * Usage:            PositiveRationals represents the domain of strictly positive rational numbers, as in x ∈ PositiveRationals.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PositiveRationals
 * Documentation:    web: http://reference.wolfram.com/language/ref/PositiveRationals.html
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
fun positiveRationals(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PositiveRationals", arguments.toMutableList(), options)
}
