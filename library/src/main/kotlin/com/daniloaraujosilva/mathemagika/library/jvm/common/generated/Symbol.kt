package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Symbol
 * 
 * Full name:        System`Symbol
 * 
 * Usage:            Symbol["name"] refers to a symbol with the specified name. 
 * 
 * Options:          None
 * 
 *                   Locked
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Symbol
 * Documentation:    web: http://reference.wolfram.com/language/ref/Symbol.html
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
fun symbol(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Symbol", arguments.toMutableList(), options)
}
