package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Key
 *
 * Full name:        System`Key
 *
 *                   Key[key] represents a key used to access a value in an association.
 * Usage:            Key[key][assoc] extracts the value corresponding to key in the association assoc.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Key
 * Documentation:    web: http://reference.wolfram.com/language/ref/Key.html
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
fun key(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Key", arguments.toMutableList(), options)
}
