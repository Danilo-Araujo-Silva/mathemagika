package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             HypergeometricPFQ
 * 
 * Full name:        System`HypergeometricPFQ
 * 
 *                   HypergeometricPFQ[{a , …, a }, {b , …, b }, z] is the generalized hypergeometric function    F  (a ; b ; z). 
 * Usage:                                1      p     1      q                                                  p    q
 * 
 * Options:          None
 * 
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/HypergeometricPFQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/HypergeometricPFQ.html
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
fun hypergeometricPFQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HypergeometricPFQ", arguments.toMutableList(), options)
}
