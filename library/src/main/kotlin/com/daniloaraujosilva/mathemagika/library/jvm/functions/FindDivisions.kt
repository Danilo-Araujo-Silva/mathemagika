package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindDivisions
 *
 * Full name:        System`FindDivisions
 *
 *                   FindDivisions[{x   , x   }, n] finds a list of about n "nice" numbers that divide the interval around x    to x    into equally spaced parts.
 *                                   min   max                                                                              min     max
 *                   FindDivisions[{x   , x   , dx}, n] makes the parts always have lengths that are integer multiples of dx.
 *                                   min   max
 *                   FindDivisions[{x   , x   }, {n , n , …}] finds successive subdivisions into about n , n , … parts.
 *                                   min   max     1   2                                                1   2
 *                   FindDivisions[{x   , x   , {dx , dx , …}}, {n , n , …}] uses spacings that are forced to be multiples of dx , dx , ….
 * Usage:                            min   max     1    2         1   2                                                         1    2
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindDivisions
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindDivisions.html
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
fun findDivisions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindDivisions", arguments.toMutableList(), options)
}
