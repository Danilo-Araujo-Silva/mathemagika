package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ExpIntegralEi
 * 
 * Full name:        System`ExpIntegralEi
 * 
 * Usage:            ExpIntegralEi[z] gives the exponential integral function Ei(z). 
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/ExpIntegralEi
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExpIntegralEi.html
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
fun expIntegralEi(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExpIntegralEi", arguments.toMutableList(), options)
}
