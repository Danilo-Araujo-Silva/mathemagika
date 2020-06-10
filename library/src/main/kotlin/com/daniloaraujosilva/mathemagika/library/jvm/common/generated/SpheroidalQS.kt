package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SpheroidalQS
 * 
 * Full name:        System`SpheroidalQS
 * 
 *                   SpheroidalQS[n, m, γ, z] gives the angular spheroidal function QS    (γ, z) of the second kind.
 * Usage:                                                                             n, m
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SpheroidalQS
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpheroidalQS.html
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
fun spheroidalQS(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpheroidalQS", arguments.toMutableList(), options)
}
