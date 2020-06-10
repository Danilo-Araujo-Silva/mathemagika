package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Prime
 * 
 * Full name:        System`Prime
 * 
 *                                        th
 *                   Prime[n] gives the n   prime number p .
 * Usage:                                                  n
 * 
 * Options:          None
 * 
 *                   Listable
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Prime
 * Documentation:    web: http://reference.wolfram.com/language/ref/Prime.html
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
fun prime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Prime", arguments.toMutableList(), options)
}
