package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Hypergeometric2F1
 * 
 * Full name:        System`Hypergeometric2F1
 * 
 *                   Hypergeometric2F1[a, b, c, z] is the hypergeometric function   F (a, b ; c ; z). 
 * Usage:                                                                          2  1
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Hypergeometric2F1
 * Documentation:    web: http://reference.wolfram.com/language/ref/Hypergeometric2F1.html
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
fun hypergeometric2F1(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Hypergeometric2F1", arguments.toMutableList(), options)
}
