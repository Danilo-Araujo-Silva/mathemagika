package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SecuredAuthenticationKeys
 *
 * Full name:        System`SecuredAuthenticationKeys
 *
 *                   SecuredAuthenticationKeys[] retrieves a list of all instances of SecuredAuthenticationKey owned by the currently connected user.
 * Usage:            SecuredAuthenticationKeys["name"] retrieves a SecuredAuthenticationKey identified by "name" owned by the currently connected user, if it exists.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SecuredAuthenticationKeys
 * Documentation:    web: http://reference.wolfram.com/language/ref/SecuredAuthenticationKeys.html
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
fun securedAuthenticationKeys(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SecuredAuthenticationKeys", arguments.toMutableList(), options)
}
