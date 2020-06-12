package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             KeepExistingVersion
 *
 * Full name:        System`KeepExistingVersion
 *
 * Usage:            KeepExistingVersion is an option to PacletInstall and PacletInstallSubmit that specifies whether an older version of a paclet should remain installed when a newer one gets installed.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/KeepExistingVersion
 * Documentation:    web: http://reference.wolfram.com/language/ref/KeepExistingVersion.html
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
fun keepExistingVersion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KeepExistingVersion", arguments.toMutableList(), options)
}
