package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Subdivide
 *
 * Full name:        System`Subdivide
 *
 *                   Subdivide[n] generates the list {0, 1/n, 2/n, …, 1}.
 *                   Subdivide[x   , n] generates the list of values obtained by subdividing the interval 0 to x    into n equal parts.
 *                              max                                                                             max
 *                   Subdivide[x   , x   , n] generates the list of values from subdividing the interval x    to x   .
 * Usage:                       min   max                                                                 min     max
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Subdivide
 * Documentation:    web: http://reference.wolfram.com/language/ref/Subdivide.html
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
fun subdivide(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Subdivide", arguments.toMutableList(), options)
}
