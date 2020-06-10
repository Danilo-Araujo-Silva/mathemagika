package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Contexts
 * 
 * Full name:        System`Contexts
 * 
 *                   Contexts[] gives a list of all contexts. 
 * Usage:            Contexts["string"] gives a list of the contexts that match the string. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Contexts
 * Documentation:    web: http://reference.wolfram.com/language/ref/Contexts.html
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
fun contexts(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Contexts", arguments.toMutableList(), options)
}
