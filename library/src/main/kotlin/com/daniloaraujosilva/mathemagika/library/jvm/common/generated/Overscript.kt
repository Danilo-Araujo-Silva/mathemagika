package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Overscript
 * 
 * Full name:        System`Overscript
 * 
 *                                                                 y
 * Usage:            Overscript[x, y] is an object that formats as x. 
 * 
 * Options:          None
 * 
 * Attributes:       NHoldRest
 * 
 *                   local: paclet:ref/Overscript
 * Documentation:    web: http://reference.wolfram.com/language/ref/Overscript.html
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
fun overscript(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Overscript", arguments.toMutableList(), options)
}
