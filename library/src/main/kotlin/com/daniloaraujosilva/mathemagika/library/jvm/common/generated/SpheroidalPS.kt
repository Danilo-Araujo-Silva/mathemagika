package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SpheroidalPS
 * 
 * Full name:        System`SpheroidalPS
 * 
 *                   SpheroidalPS[n, m, γ, z] gives the angular spheroidal function PS    (γ, z) of the first kind.
 * Usage:                                                                             n, m
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SpheroidalPS
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpheroidalPS.html
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
fun spheroidalPS(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpheroidalPS", arguments.toMutableList(), options)
}
