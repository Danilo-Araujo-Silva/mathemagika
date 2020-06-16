package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Cuboid
 *
 * Full name:        System`Cuboid
 *
 *                   Cuboid[p   ] represents a unit hypercube with its lower corner at p   .
 *                           min                                                        min
 *                   Cuboid[p   , p   ] represents an axis-aligned filled cuboid with lower corner p    and upper corner p   .
 * Usage:                    min   max                                                              min                   max
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Cuboid
 * Documentation:    web: http://reference.wolfram.com/language/ref/Cuboid.html
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
fun cuboid(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Cuboid", arguments.toMutableList(), options)
}
