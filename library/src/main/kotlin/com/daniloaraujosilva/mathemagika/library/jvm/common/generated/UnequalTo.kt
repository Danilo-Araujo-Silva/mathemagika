package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             UnequalTo
 * 
 * Full name:        System`UnequalTo
 * 
 * Usage:            UnequalTo[y] is an operator form that yields x ≠ y when applied to an expression x.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/UnequalTo
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnequalTo.html
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
fun unequalTo(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnequalTo", arguments.toMutableList(), options)
}
