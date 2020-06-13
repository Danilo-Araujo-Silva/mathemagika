package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SynchronousUpdating
 *
 * Full name:        System`SynchronousUpdating
 *
 * Usage:            SynchronousUpdating is an option for Manipulate, Dynamic, and related functions that specifies whether or not to evaluate their contents synchronously.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SynchronousUpdating
 * Documentation:    web: http://reference.wolfram.com/language/ref/SynchronousUpdating.html
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
fun synchronousUpdating(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SynchronousUpdating", arguments.toMutableList(), options)
}
