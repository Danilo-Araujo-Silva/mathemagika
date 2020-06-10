package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             On
 * 
 * Full name:        System`On
 * 
 *                   On[symbol :: tag] switches on a message, so that it can be printed. 
 *                   On["name"] switches on a named group of messages.
 *                   On[s] switches on tracing for the symbol s. 
 *                   On[m , m , …] switches on several messages or message groups. 
 * Usage:                1   2
 * 
 * Options:          None
 * 
 *                   HoldAll
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/On
 * Documentation:    web: http://reference.wolfram.com/language/ref/On.html
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
fun on(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("On", arguments.toMutableList(), options)
}
