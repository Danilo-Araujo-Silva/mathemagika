package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NonPositiveReals
 *
 * Full name:        System`NonPositiveReals
 *
 * Usage:            NonPositiveReals represents the domain of non-positive real numbers.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NonPositiveReals
 * Documentation:    web: http://reference.wolfram.com/language/ref/NonPositiveReals.html
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
fun nonPositiveReals(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NonPositiveReals", arguments.toMutableList(), options)
}
