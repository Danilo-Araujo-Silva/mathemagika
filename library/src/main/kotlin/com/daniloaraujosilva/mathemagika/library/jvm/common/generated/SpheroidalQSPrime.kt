package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SpheroidalQSPrime
 * 
 * Full name:        System`SpheroidalQSPrime
 * 
 *                   SpheroidalQSPrime[n, m, γ, z] gives the derivative with respect to z of the angular spheroidal function QS    (γ, z) of the second kind.
 * Usage:                                                                                                                      n, m
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SpheroidalQSPrime
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpheroidalQSPrime.html
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
fun spheroidalQSPrime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpheroidalQSPrime", arguments.toMutableList(), options)
}
