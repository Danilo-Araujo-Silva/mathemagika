package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Permissions
 *
 * Full name:        System`Permissions
 *
 * Usage:            Permissions is an option for CloudObject and related cloud functions that specifies permissions for classes of users to access or perform operations.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Permissions
 * Documentation:    web: http://reference.wolfram.com/language/ref/Permissions.html
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
fun permissions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Permissions", arguments.toMutableList(), options)
}
