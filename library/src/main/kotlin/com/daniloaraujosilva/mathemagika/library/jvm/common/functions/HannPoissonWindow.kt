package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HannPoissonWindow
 *
 * Full name:        System`HannPoissonWindow
 *
 *                   HannPoissonWindow[x] represents a Hann–Poisson window function of x.
 * Usage:            HannPoissonWindow[x, α] uses the parameter α.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/HannPoissonWindow
 * Documentation:    web: http://reference.wolfram.com/language/ref/HannPoissonWindow.html
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
fun hannPoissonWindow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HannPoissonWindow", arguments.toMutableList(), options)
}
