package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ToSphericalCoordinates
 *
 * Full name:        System`ToSphericalCoordinates
 *
 * Usage:            ToSphericalCoordinates[{x, y, z}] gives the {r, θ, ϕ} spherical coordinates corresponding to the Cartesian coordinates {x, y, z}.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ToSphericalCoordinates
 * Documentation:    web: http://reference.wolfram.com/language/ref/ToSphericalCoordinates.html
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
fun toSphericalCoordinates(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ToSphericalCoordinates", arguments.toMutableList(), options)
}
