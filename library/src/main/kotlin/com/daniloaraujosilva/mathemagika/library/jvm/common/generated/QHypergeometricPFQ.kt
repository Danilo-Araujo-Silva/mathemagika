package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             QHypergeometricPFQ
 * 
 * Full name:        System`QHypergeometricPFQ
 * 
 *                   QHypergeometricPFQ[{a , …, a }, {b , …, b }, q, z] gives the basic hypergeometric series    ϕ  (a ; b ; q ; z).
 * Usage:                                 1      r     1      s                                                r    s
 * 
 * Options:          None
 * 
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/QHypergeometricPFQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/QHypergeometricPFQ.html
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
fun qHypergeometricPFQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("QHypergeometricPFQ", arguments.toMutableList(), options)
}
