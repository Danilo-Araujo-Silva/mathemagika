package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             LinkWrite
 * 
 * Full name:        System`LinkWrite
 * 
 * Usage:            LinkWrite[link, expr] writes expr to the specified WSTP connection. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/LinkWrite
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinkWrite.html
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
fun linkWrite(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinkWrite", arguments.toMutableList(), options)
}
