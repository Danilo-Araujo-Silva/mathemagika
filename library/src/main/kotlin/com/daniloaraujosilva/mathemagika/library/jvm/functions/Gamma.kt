package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Gamma
 *
 * Full name:        System`Gamma
 *
 *                   Gamma[z] is the Euler gamma function Γ(z).
 *                   Gamma[a, z] is the incomplete gamma function Γ(a, z).
 *                   Gamma[a, z , z ] is the generalized incomplete gamma function Γ(a, z ) - Γ(a, z ).
 * Usage:                      0   1                                                     0          1
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Gamma
 * Documentation:    web: http://reference.wolfram.com/language/ref/Gamma.html
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
fun gamma(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Gamma", arguments.toMutableList(), options)
}
