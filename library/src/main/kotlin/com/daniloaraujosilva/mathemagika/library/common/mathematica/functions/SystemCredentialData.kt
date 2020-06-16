package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SystemCredentialData
 *
 * Full name:        System`SystemCredentialData
 *
 * Usage:            SystemCredentialData[assoc, "pwfield"] represents data intended for secure credential storage.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemCredentialData
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemCredentialData.html
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
fun systemCredentialData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemCredentialData", arguments.toMutableList(), options)
}
