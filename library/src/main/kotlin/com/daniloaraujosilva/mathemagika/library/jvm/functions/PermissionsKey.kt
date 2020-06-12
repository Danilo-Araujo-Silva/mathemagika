package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PermissionsKey
 *
 * Full name:        System`PermissionsKey
 *
 * Usage:            PermissionsKey["key"] represents a permissions key that can be used to authorize access to cloud resources.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PermissionsKey
 * Documentation:    web: http://reference.wolfram.com/language/ref/PermissionsKey.html
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
fun permissionsKey(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PermissionsKey", arguments.toMutableList(), options)
}
