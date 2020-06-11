package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CreateUUID
 *
 * Full name:        System`CreateUUID
 *
 *                   CreateUUID[] creates a random, universally unique UUID string.
 * Usage:            CreateUUID["base"] appends a UUID string to the specified base string.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CreateUUID
 * Documentation:    web: http://reference.wolfram.com/language/ref/CreateUUID.html
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
fun createUUID(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CreateUUID", arguments.toMutableList(), options)
}
