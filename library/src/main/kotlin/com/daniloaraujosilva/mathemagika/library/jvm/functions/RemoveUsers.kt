package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RemoveUsers
 *
 * Full name:        System`RemoveUsers
 *
 *                   RemoveUsers[group, {user , …}] removes the users user  from the permissions group group.
 * Usage:                                    1                            i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RemoveUsers
 * Documentation:    web: http://reference.wolfram.com/language/ref/RemoveUsers.html
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
fun removeUsers(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RemoveUsers", arguments.toMutableList(), options)
}
