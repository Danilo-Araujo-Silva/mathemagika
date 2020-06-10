package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AddUsers
 * 
 * Full name:        System`AddUsers
 * 
 *                   AddUsers[group, {user , …}] adds the users user  to the permissions group group. 
 * Usage:                                 1                         i
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/AddUsers
 * Documentation:    web: http://reference.wolfram.com/language/ref/AddUsers.html
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
fun addUsers(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AddUsers", arguments.toMutableList(), options)
}
