package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CauchyWindow
 *
 * Full name:        System`CauchyWindow
 *
 *                   CauchyWindow[x] represents a Cauchy window function of x.
 * Usage:            CauchyWindow[x, α] uses the parameter α.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CauchyWindow
 * Documentation:    web: http://reference.wolfram.com/language/ref/CauchyWindow.html
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
fun cauchyWindow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CauchyWindow", arguments.toMutableList(), options)
}
