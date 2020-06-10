package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Greater
 * 
 * Full name:        System`Greater
 * 
 *                   x > y yields True if x is determined to be greater than y. 
 *                   x  > x  > x  yields True if the x  form a strictly decreasing sequence. 
 * Usage:             1    2    3                     i
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Greater
 * Documentation:    web: http://reference.wolfram.com/language/ref/Greater.html
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
fun greater(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Greater", arguments.toMutableList(), options)
}
