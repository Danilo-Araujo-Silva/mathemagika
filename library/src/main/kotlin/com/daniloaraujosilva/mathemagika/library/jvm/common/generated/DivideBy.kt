package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DivideBy
 * 
 * Full name:        System`DivideBy
 * 
 * Usage:            x/=c divides x by c and returns the new value of x. 
 * 
 * Options:          None
 * 
 *                   HoldFirst
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/DivideBy
 * Documentation:    web: http://reference.wolfram.com/language/ref/DivideBy.html
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
fun divideBy(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DivideBy", arguments.toMutableList(), options)
}
