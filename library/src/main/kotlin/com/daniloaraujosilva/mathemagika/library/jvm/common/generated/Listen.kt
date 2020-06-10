package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Listen
 * 
 * Full name:        System`Listen
 * 
 * Usage:            Listen is a setting for the LinkMode option of LinkOpen.  LinkMode->Listen causes a link to be created that listens on a named port for an incoming connection request.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun listen(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Listen", arguments.toMutableList(), options)
}
