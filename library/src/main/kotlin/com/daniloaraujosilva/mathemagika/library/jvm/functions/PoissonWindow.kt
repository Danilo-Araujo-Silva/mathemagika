package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PoissonWindow
 *
 * Full name:        System`PoissonWindow
 *
 *                   PoissonWindow[x] represents a Poisson window function of x.
 * Usage:            PoissonWindow[x, α] uses the parameter α.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PoissonWindow
 * Documentation:    web: http://reference.wolfram.com/language/ref/PoissonWindow.html
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
fun poissonWindow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PoissonWindow", arguments.toMutableList(), options)
}
