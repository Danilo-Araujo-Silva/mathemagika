package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ToPolarCoordinates
 *
 * Full name:        System`ToPolarCoordinates
 *
 *                   ToPolarCoordinates[{x, y}] gives the {r, θ} polar coordinates corresponding to the Cartesian coordinates {x, y}.
 *                   ToPolarCoordinates[{x , x , …, x }] gives the hyperspherical coordinates corresponding to the Cartesian coordinates {x , x , …, x }.
 * Usage:                                 1   2      n                                                                                     1   2      n
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ToPolarCoordinates
 * Documentation:    web: http://reference.wolfram.com/language/ref/ToPolarCoordinates.html
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
fun toPolarCoordinates(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ToPolarCoordinates", arguments.toMutableList(), options)
}
