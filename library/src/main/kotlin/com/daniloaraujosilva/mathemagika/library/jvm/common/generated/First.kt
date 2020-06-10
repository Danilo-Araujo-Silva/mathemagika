package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             First
 * 
 * Full name:        System`First
 * 
 *                   First[expr] gives the first element in expr. 
 * Usage:            First[expr, def] gives the first element if it exists, or def otherwise.
 * 
 * Options:          None
 * 
 *                   HoldRest
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/First
 * Documentation:    web: http://reference.wolfram.com/language/ref/First.html
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
fun first(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("First", arguments.toMutableList(), options)
}
