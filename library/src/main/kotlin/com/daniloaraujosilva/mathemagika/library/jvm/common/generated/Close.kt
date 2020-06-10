package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Close
 * 
 * Full name:        System`Close
 * 
 * Usage:            Close[obj] closes a stream or socket. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Close
 * Documentation:    web: http://reference.wolfram.com/language/ref/Close.html
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
fun close(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Close", arguments.toMutableList(), options)
}
