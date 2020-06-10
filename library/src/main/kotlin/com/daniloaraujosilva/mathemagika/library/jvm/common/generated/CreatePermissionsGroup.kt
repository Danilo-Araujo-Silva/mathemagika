package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CreatePermissionsGroup
 * 
 * Full name:        System`CreatePermissionsGroup
 * 
 *                   CreatePermissionsGroup["name"] creates a permissions group with the specified name.
 *                   CreatePermissionsGroup["name", {user , user , …}] creates a permissions group consisting of the specified initial users.
 * Usage:                                                1      2
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/CreatePermissionsGroup
 * Documentation:    web: http://reference.wolfram.com/language/ref/CreatePermissionsGroup.html
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
fun createPermissionsGroup(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CreatePermissionsGroup", arguments.toMutableList(), options)
}
