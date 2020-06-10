package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             LessEqual
 * 
 * Full name:        System`LessEqual
 * 
 *                   x <= y or x ≤ y yields True if x is determined to be less than or equal to y.
 *                   x  ≤ x  ≤ x  yields True if the x  form a nondecreasing sequence. 
 * Usage:             1    2    3                     i
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/LessEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/LessEqual.html
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
fun lessEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LessEqual", arguments.toMutableList(), options)
}
