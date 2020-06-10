package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Underscript
 * 
 * Full name:        System`Underscript
 * 
 *                   Underscript[x, y] is an object that formats as x. 
 * Usage:                                                           y
 * 
 * Options:          None
 * 
 * Attributes:       NHoldRest
 * 
 *                   local: paclet:ref/Underscript
 * Documentation:    web: http://reference.wolfram.com/language/ref/Underscript.html
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
fun underscript(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Underscript", arguments.toMutableList(), options)
}