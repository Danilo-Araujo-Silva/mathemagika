package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SphericalHarmonicY
 *
 * Full name:        System`SphericalHarmonicY
 *
 *                                                                                m
 *                   SphericalHarmonicY[l, m, θ, ϕ] gives the spherical harmonic Y (θ, ϕ).
 * Usage:                                                                         l
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SphericalHarmonicY
 * Documentation:    web: http://reference.wolfram.com/language/ref/SphericalHarmonicY.html
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
fun sphericalHarmonicY(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SphericalHarmonicY", arguments.toMutableList(), options)
}
