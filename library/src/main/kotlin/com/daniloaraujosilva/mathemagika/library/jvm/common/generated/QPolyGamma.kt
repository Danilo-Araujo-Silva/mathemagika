package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             QPolyGamma
 * 
 * Full name:        System`QPolyGamma
 * 
 *                   QPolyGamma[z, q] gives the q-digamma function ψ (z).
 *                                                                  q
 *                                                   th                                       (n)
 *                   QPolyGamma[n, z, q] gives the n   derivative of the q-digamma function ψ   (z).
 * Usage:                                                                                     q
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NHoldFirst
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/QPolyGamma
 * Documentation:    web: http://reference.wolfram.com/language/ref/QPolyGamma.html
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
fun qPolyGamma(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("QPolyGamma", arguments.toMutableList(), options)
}
