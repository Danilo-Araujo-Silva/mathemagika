package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Off
 * 
 * Full name:        System`Off
 * 
 *                   Off[symbol :: tag] switches off a message, so that it is no longer printed. 
 *                   Off["name"] switches off a named group of messages.
 *                   Off[s] switches off tracing messages associated with the symbol s. 
 *                   Off[m , m , …] switches off several messages or message groups. 
 * Usage:                 1   2
 * 
 * Options:          None
 * 
 *                   HoldAll
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Off
 * Documentation:    web: http://reference.wolfram.com/language/ref/Off.html
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
fun off(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Off", arguments.toMutableList(), options)
}
