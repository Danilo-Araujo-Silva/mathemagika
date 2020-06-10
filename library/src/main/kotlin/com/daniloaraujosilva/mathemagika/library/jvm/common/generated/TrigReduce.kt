package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TrigReduce
 * 
 * Full name:        System`TrigReduce
 * 
 * Usage:            TrigReduce[expr] rewrites products and powers of trigonometric functions in expr in terms of trigonometric functions with combined arguments. 
 * 
 * Options:          Modulus -> 0
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/TrigReduce
 * Documentation:    web: http://reference.wolfram.com/language/ref/TrigReduce.html
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
fun trigReduce(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TrigReduce", arguments.toMutableList(), options)
}
