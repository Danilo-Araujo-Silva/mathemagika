package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AutoMultiplicationSymbol
 *
 * Full name:        System`AutoMultiplicationSymbol
 *
 * Usage:            AutoMultiplicationSymbol is an option for objects such as Cell and Notebook that specifies whether to automatically display a multiplication symbol between elements that would be multiplied if evaluated.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AutoMultiplicationSymbol
 * Documentation:    web: http://reference.wolfram.com/language/ref/AutoMultiplicationSymbol.html
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
fun autoMultiplicationSymbol(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AutoMultiplicationSymbol", arguments.toMutableList(), options)
}
