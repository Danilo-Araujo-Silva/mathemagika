package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ConnesWindow
 *
 * Full name:        System`ConnesWindow
 *
 *                   ConnesWindow[x] represents a Connes window function of x.
 * Usage:            ConnesWindow[x, α] uses the parameter α.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ConnesWindow
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConnesWindow.html
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
fun connesWindow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConnesWindow", arguments.toMutableList(), options)
}
