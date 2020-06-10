package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PreIncrement
 * 
 * Full name:        System`PreIncrement
 * 
 * Usage:            ++x increases the value of x by 1, returning the new value of x. 
 * 
 * Options:          None
 * 
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/PreIncrement
 * Documentation:    web: http://reference.wolfram.com/language/ref/PreIncrement.html
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
fun preIncrement(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PreIncrement", arguments.toMutableList(), options)
}
