package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PermissionsGroups
 * 
 * Full name:        System`PermissionsGroups
 * 
 * Usage:            PermissionsGroups[] gives a list of permissions groups belonging to the current user.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/PermissionsGroups
 * Documentation:    web: http://reference.wolfram.com/language/ref/PermissionsGroups.html
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
fun permissionsGroups(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PermissionsGroups", arguments.toMutableList(), options)
}
