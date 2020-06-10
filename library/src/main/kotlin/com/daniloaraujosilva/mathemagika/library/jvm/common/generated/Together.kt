package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Together
 * 
 * Full name:        System`Together
 * 
 * Usage:            Together[expr] puts terms in a sum over a common denominator, and cancels factors in the result. 
 * 
 *                   Extension -> None
 *                   Modulus -> 0
 * Options:          Trig -> False
 * 
 *                   Listable
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Together
 * Documentation:    web: http://reference.wolfram.com/language/ref/Together.html
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
fun together(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Together", arguments.toMutableList(), options)
}
