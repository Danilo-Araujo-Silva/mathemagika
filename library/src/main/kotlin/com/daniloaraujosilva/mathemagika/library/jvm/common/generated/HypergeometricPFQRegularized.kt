package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             HypergeometricPFQRegularized
 * 
 * Full name:        System`HypergeometricPFQRegularized
 * 
 *                   HypergeometricPFQRegularized[{a , …, a }, {b , …, b }, z] is the regularized generalized hypergeometric function    F  (a ; b ; z)/(Γ (b ) …Γ (b )). 
 * Usage:                                           1      p     1      q                                                              p    q                  1       q
 * 
 * Options:          None
 * 
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/HypergeometricPFQRegularized
 * Documentation:    web: http://reference.wolfram.com/language/ref/HypergeometricPFQRegularized.html
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
fun hypergeometricPFQRegularized(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HypergeometricPFQRegularized", arguments.toMutableList(), options)
}
