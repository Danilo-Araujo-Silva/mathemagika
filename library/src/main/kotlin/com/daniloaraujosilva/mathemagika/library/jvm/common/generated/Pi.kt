package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Pi
 * 
 * Full name:        System`Pi
 * 
 * Usage:            Pi is π, with numerical value ≃ 3.14159. 
 * 
 * Options:          None
 * 
 *                   Constant
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Pi
 * Documentation:    web: http://reference.wolfram.com/language/ref/Pi.html
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
fun pi(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Pi", arguments.toMutableList(), options)
}
