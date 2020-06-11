package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SystemCredentialKeys
 *
 * Full name:        System`SystemCredentialKeys
 *
 * Usage:            SystemCredentialKeys["patt"] gives the list of keys in secure storage that match patt.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemCredentialKeys
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemCredentialKeys.html
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
fun systemCredentialKeys(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemCredentialKeys", arguments.toMutableList(), options)
}
