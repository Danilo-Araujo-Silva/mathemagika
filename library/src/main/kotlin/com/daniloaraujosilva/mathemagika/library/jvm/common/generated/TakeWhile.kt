package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TakeWhile
 * 
 * Full name:        System`TakeWhile
 * 
 *                   TakeWhile[list, crit] gives elements e  from the beginning of list, continuing so long as crit[e ] is True.
 * Usage:                                                  i                                                         i
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/TakeWhile
 * Documentation:    web: http://reference.wolfram.com/language/ref/TakeWhile.html
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
fun takeWhile(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TakeWhile", arguments.toMutableList(), options)
}
