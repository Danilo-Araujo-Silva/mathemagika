package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CosIntegral
 * 
 * Full name:        System`CosIntegral
 * 
 * Usage:            CosIntegral[z] gives the cosine integral function Ci(z). 
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/CosIntegral
 * Documentation:    web: http://reference.wolfram.com/language/ref/CosIntegral.html
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
fun cosIntegral(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CosIntegral", arguments.toMutableList(), options)
}
