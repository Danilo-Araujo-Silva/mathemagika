package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SphericalBesselJ
 *
 * Full name:        System`SphericalBesselJ
 *
 *                   SphericalBesselJ[n, z] gives the spherical Bessel function of the first kind j (z).
 * Usage:                                                                                          n
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SphericalBesselJ
 * Documentation:    web: http://reference.wolfram.com/language/ref/SphericalBesselJ.html
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
fun sphericalBesselJ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SphericalBesselJ", arguments.toMutableList(), options)
}
