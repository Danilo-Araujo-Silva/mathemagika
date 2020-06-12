package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NonNegativeReals
 *
 * Full name:        System`NonNegativeReals
 *
 * Usage:            NonNegativeReals represents the domain of non-negative real numbers.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NonNegativeReals
 * Documentation:    web: http://reference.wolfram.com/language/ref/NonNegativeReals.html
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
fun nonNegativeReals(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NonNegativeReals", arguments.toMutableList(), options)
}
