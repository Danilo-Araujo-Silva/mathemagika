package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SpheroidalPSPrime
 *
 * Full name:        System`SpheroidalPSPrime
 *
 *                   SpheroidalPSPrime[n, m, γ, z] gives the derivative with respect to z of the angular spheroidal function PS    (γ, z) of the first kind.
 * Usage:                                                                                                                      n, m
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SpheroidalPSPrime
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpheroidalPSPrime.html
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
fun spheroidalPSPrime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpheroidalPSPrime", arguments.toMutableList(), options)
}
