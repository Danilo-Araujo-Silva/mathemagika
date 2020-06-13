package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TakeLargest
 *
 * Full name:        System`TakeLargest
 *
 *                   TakeLargest[list, n] gives the n numerically largest elements in list, sorted in descending order.
 *                   TakeLargest[list  prop, n] gives the property prop for the n largest elements in list.
 * Usage:            TakeLargest[n] represents an operator form of TakeLargest that can be applied to an expression.
 *
 * Options:          ExcludedForms -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TakeLargest
 * Documentation:    web: http://reference.wolfram.com/language/ref/TakeLargest.html
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
fun takeLargest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TakeLargest", arguments.toMutableList(), options)
}
