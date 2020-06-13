package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FromPolarCoordinates
 *
 * Full name:        System`FromPolarCoordinates
 *
 *                   FromPolarCoordinates[{r, θ}] gives the {x, y} Cartesian coordinates corresponding to the polar coordinates {r, θ}.
 *                   FromPolarCoordinates[{r, θ , …, θ     , ϕ}] gives the coordinates corresponding to the hyperspherical coordinates {r, θ , …, θ     , ϕ}
 * Usage:                                      1      n - 2                                                                                 1      n - 2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FromPolarCoordinates
 * Documentation:    web: http://reference.wolfram.com/language/ref/FromPolarCoordinates.html
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
fun fromPolarCoordinates(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FromPolarCoordinates", arguments.toMutableList(), options)
}
