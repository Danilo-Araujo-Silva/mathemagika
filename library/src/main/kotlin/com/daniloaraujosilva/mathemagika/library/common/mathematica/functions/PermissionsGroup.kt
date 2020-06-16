package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PermissionsGroup
 *
 * Full name:        System`PermissionsGroup
 *
 *                   PermissionsGroup["name"] represents a permissions group with the specified name, owned by the current user.
 * Usage:            PermissionsGroup[user, "name"] represents a permissions group owned by the specified user.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PermissionsGroup
 * Documentation:    web: http://reference.wolfram.com/language/ref/PermissionsGroup.html
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
fun permissionsGroup(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PermissionsGroup", arguments.toMutableList(), options)
}
