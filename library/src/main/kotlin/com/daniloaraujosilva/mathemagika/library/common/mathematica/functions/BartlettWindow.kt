package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BartlettWindow
 *
 * Full name:        System`BartlettWindow
 *
 * Usage:            BartlettWindow[x] represents a Bartlett window function of x.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BartlettWindow
 * Documentation:    web: http://reference.wolfram.com/language/ref/BartlettWindow.html
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
fun bartlettWindow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BartlettWindow", arguments.toMutableList(), options)
}
