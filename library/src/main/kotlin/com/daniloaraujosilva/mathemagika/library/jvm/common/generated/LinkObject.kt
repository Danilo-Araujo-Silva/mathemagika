package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             LinkObject
 * 
 * Full name:        System`LinkObject
 * 
 *                   LinkObject["name", n , n ] is an object that represents an active WSTP connection for functions such as LinkRead and LinkWrite. 
 * Usage:                                1   2
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/LinkObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinkObject.html
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
fun linkObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinkObject", arguments.toMutableList(), options)
}
