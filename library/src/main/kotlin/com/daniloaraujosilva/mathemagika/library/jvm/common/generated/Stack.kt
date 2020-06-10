package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Stack
 * 
 * Full name:        System`Stack
 * 
 *                   Stack[] shows the current evaluation stack, giving a list of the tags associated with evaluations that are currently being done. 
 * Usage:            Stack[pattern] gives a list of expressions currently being evaluated which match the pattern. 
 * 
 * Options:          None
 * 
 *                   HoldFirst
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Stack
 * Documentation:    web: http://reference.wolfram.com/language/ref/Stack.html
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
fun stack(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Stack", arguments.toMutableList(), options)
}
