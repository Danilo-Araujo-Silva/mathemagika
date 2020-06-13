package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Locked
 *
 * Full name:        System`Locked
 *
 * Usage:            Locked is an attribute that, once assigned, prevents modification of any attributes of a symbol.
 *
 * Options:          None
 *
 *                   Locked
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Locked
 * Documentation:    web: http://reference.wolfram.com/language/ref/Locked.html
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
fun locked(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Locked", arguments.toMutableList(), options)
}
