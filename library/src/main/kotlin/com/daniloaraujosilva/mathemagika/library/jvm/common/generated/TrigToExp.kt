package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TrigToExp
 * 
 * Full name:        System`TrigToExp
 * 
 * Usage:            TrigToExp[expr] converts trigonometric functions in expr to exponentials. 
 * 
 * Options:          None
 * 
 *                   Listable
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/TrigToExp
 * Documentation:    web: http://reference.wolfram.com/language/ref/TrigToExp.html
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
fun trigToExp(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TrigToExp", arguments.toMutableList(), options)
}
