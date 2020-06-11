package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SplineClosed
 *
 * Full name:        System`SplineClosed
 *
 * Usage:            SplineClosed is an option for B-spline functions and graphics primitives that specifies whether spline curves or surfaces should be closed.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SplineClosed
 * Documentation:    web: http://reference.wolfram.com/language/ref/SplineClosed.html
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
fun splineClosed(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SplineClosed", arguments.toMutableList(), options)
}
