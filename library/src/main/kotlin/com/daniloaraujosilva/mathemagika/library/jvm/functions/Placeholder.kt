package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Placeholder
 *
 * Full name:        System`Placeholder
 *
 *                   Placeholder[name] represents a placeholder labeled with name that indicates a place to type.
 * Usage:            Placeholder[] gives the empty placeholder .
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Placeholder
 * Documentation:    web: http://reference.wolfram.com/language/ref/Placeholder.html
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
fun placeholder(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Placeholder", arguments.toMutableList(), options)
}
