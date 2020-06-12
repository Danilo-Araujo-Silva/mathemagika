package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SystemCredentialKey
 *
 * Full name:        System`SystemCredentialKey
 *
 * Usage:            SystemCredentialKey is an option of AuthenticationDialog that specifies the name for secure storage of the requested credentials.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemCredentialKey
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemCredentialKey.html
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
fun systemCredentialKey(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemCredentialKey", arguments.toMutableList(), options)
}
