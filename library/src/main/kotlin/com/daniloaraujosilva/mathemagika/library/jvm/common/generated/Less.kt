package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Less
 * 
 * Full name:        System`Less
 * 
 *                   x < y yields True if x is determined to be less than y. 
 *                   x  < x  < x  yields True if the x  form a strictly increasing sequence. 
 * Usage:             1    2    3                     i
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Less
 * Documentation:    web: http://reference.wolfram.com/language/ref/Less.html
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
fun less(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Less", arguments.toMutableList(), options)
}
