package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GenerateSecuredAuthenticationKey
 * 
 * Full name:        System`GenerateSecuredAuthenticationKey
 * 
 *                   GenerateSecuredAuthenticationKey[] generates a new anonymous SecuredAuthenticationKey owned by the current user ID.
 *                   GenerateSecuredAuthenticationKey["name"] generates a new SecuredAuthenticationKey with the specified name owned by the current user ID.
 * Usage:            GenerateSecuredAuthenticationKey[SecuredAuthenticationKey[…]] generates a new set of credentials for an existing SecuredAuthenticationKey.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/GenerateSecuredAuthenticationKey
 * Documentation:    web: http://reference.wolfram.com/language/ref/GenerateSecuredAuthenticationKey.html
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
fun generateSecuredAuthenticationKey(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GenerateSecuredAuthenticationKey", arguments.toMutableList(), options)
}
