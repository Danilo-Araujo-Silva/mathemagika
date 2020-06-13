package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TraditionalFunctionNotation
 *
 * Full name:        System`TraditionalFunctionNotation
 *
 * Usage:            TraditionalFunctionNotation is an option for selections that specifies whether input of the form f(x) is interpreted by the kernel as a function or as a product.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TraditionalFunctionNotation
 * Documentation:    web: http://reference.wolfram.com/language/ref/TraditionalFunctionNotation.html
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
fun traditionalFunctionNotation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TraditionalFunctionNotation", arguments.toMutableList(), options)
}
