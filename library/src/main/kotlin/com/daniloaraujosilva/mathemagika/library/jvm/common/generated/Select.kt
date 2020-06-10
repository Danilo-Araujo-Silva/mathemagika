package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Select
 * 
 * Full name:        System`Select
 * 
 *                   Select[list, crit] picks out all elements e  of list for which crit[e ] is True. 
 *                                                              i                         i
 *                   Select[list, crit, n] picks out the first n elements for which crit[e ] is True. 
 *                                                                                        i
 * Usage:            Select[crit] represents an operator form of Select that can be applied to an expression. 
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Select
 * Documentation:    web: http://reference.wolfram.com/language/ref/Select.html
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
fun select(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Select", arguments.toMutableList(), options)
}
