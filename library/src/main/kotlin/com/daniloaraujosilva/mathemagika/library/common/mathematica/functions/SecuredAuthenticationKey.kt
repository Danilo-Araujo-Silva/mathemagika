package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SecuredAuthenticationKey
 *
 * Full name:        System`SecuredAuthenticationKey
 *
 * Usage:            SecuredAuthenticationKey[assoc] represents a secured authentication key with credentials and details specified by the association assoc.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SecuredAuthenticationKey
 * Documentation:    web: http://reference.wolfram.com/language/ref/SecuredAuthenticationKey.html
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
fun securedAuthenticationKey(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SecuredAuthenticationKey", arguments.toMutableList(), options)
}
