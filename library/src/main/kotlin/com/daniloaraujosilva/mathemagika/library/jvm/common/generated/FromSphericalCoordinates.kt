package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FromSphericalCoordinates
 * 
 * Full name:        System`FromSphericalCoordinates
 * 
 * Usage:            FromSphericalCoordinates[{r, θ, ϕ}] gives the {x, y, z} Cartesian coordinates corresponding to the spherical coordinates {r, θ, ϕ}.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FromSphericalCoordinates
 * Documentation:    web: http://reference.wolfram.com/language/ref/FromSphericalCoordinates.html
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
fun fromSphericalCoordinates(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FromSphericalCoordinates", arguments.toMutableList(), options)
}
