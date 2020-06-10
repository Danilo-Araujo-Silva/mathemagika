package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SphericalBesselY
 * 
 * Full name:        System`SphericalBesselY
 * 
 *                   SphericalBesselY[n, z] gives the spherical Bessel function of the second kind y (z). 
 * Usage:                                                                                           n
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SphericalBesselY
 * Documentation:    web: http://reference.wolfram.com/language/ref/SphericalBesselY.html
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
fun sphericalBesselY(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SphericalBesselY", arguments.toMutableList(), options)
}
