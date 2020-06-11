package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GaussianWindow
 *
 * Full name:        System`GaussianWindow
 *
 *                   GaussianWindow[x] represents a Gaussian window function of x.
 * Usage:            GaussianWindow[x, σ] uses standard deviation σ.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GaussianWindow
 * Documentation:    web: http://reference.wolfram.com/language/ref/GaussianWindow.html
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
fun gaussianWindow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GaussianWindow", arguments.toMutableList(), options)
}
