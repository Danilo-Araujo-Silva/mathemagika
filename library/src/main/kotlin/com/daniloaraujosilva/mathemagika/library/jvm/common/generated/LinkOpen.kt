package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             LinkOpen
 * 
 * Full name:        System`LinkOpen
 * 
 * Usage:            LinkOpen["prog"] starts the external program prog and opens a MathLink connection to it.
 * 
 *                   LinkHost -> 
 *                   LinkMode -> Launch
 *                   LinkOptions -> 256
 * Options:          LinkProtocol -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/LinkOpen
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinkOpen.html
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
fun linkOpen(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinkOpen", arguments.toMutableList(), options)
}
