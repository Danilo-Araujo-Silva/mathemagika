package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TakeSmallest
 *
 * Full name:        System`TakeSmallest
 *
 *                   TakeSmallest[list, n] gives the n numerically smallest elements in list, sorted in ascending order.
 *                   TakeSmallest[list  prop, n] gives the property prop for the n smallest elements in list.
 * Usage:            TakeSmallest[n] represents an operator form of TakeSmallest that can be applied to an expression.
 *
 * Options:          ExcludedForms -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TakeSmallest
 * Documentation:    web: http://reference.wolfram.com/language/ref/TakeSmallest.html
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
fun takeSmallest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TakeSmallest", arguments.toMutableList(), options)
}
