package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Superscript
 * 
 * Full name:        System`Superscript
 * 
 *                                                                   y
 * Usage:            Superscript[x, y] is an object that formats as x . 
 * 
 * Options:          None
 * 
 *                   NHoldRest
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Superscript
 * Documentation:    web: http://reference.wolfram.com/language/ref/Superscript.html
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
fun superscript(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Superscript", arguments.toMutableList(), options)
}
