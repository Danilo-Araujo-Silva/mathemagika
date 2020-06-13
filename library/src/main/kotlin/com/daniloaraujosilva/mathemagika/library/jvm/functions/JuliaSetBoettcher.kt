package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             JuliaSetBoettcher
 *
 * Full name:        System`JuliaSetBoettcher
 *
 *                   JuliaSetBoettcher[c, z] gives the Böttcher coordinate of z with respect to the quadratic Julia set J .
 * Usage:                                                                                                                c
 *
 * Options:          MaxIterations -> 100
 *
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/JuliaSetBoettcher
 * Documentation:    web: http://reference.wolfram.com/language/ref/JuliaSetBoettcher.html
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
fun juliaSetBoettcher(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("JuliaSetBoettcher", arguments.toMutableList(), options)
}
