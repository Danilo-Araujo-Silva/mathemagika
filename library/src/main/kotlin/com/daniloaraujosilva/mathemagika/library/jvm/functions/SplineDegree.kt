package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SplineDegree
 *
 * Full name:        System`SplineDegree
 *
 * Usage:            SplineDegree is an option for spline functions and graphics primitives that specifies the degree of polynomial basis to use.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SplineDegree
 * Documentation:    web: http://reference.wolfram.com/language/ref/SplineDegree.html
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
fun splineDegree(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SplineDegree", arguments.toMutableList(), options)
}
