package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SetUsers
 *
 * Full name:        System`SetUsers
 *
 *                   SetUsers[group, {user , …}] sets the members of the permissions group group to be {user , …}.
 * Usage:                                 1                                                                 1
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SetUsers
 * Documentation:    web: http://reference.wolfram.com/language/ref/SetUsers.html
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
fun setUsers(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SetUsers", arguments.toMutableList(), options)
}
