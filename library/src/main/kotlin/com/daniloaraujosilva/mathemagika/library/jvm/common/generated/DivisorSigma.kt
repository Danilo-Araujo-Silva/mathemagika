package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DivisorSigma
 * 
 * Full name:        System`DivisorSigma
 * 
 *                   DivisorSigma[k, n] gives the divisor function σ (n). 
 * Usage:                                                           k
 * 
 * Options:          GaussianIntegers -> False
 * 
 *                   Listable
 *                   NHoldAll
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/DivisorSigma
 * Documentation:    web: http://reference.wolfram.com/language/ref/DivisorSigma.html
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
fun divisorSigma(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DivisorSigma", arguments.toMutableList(), options)
}
