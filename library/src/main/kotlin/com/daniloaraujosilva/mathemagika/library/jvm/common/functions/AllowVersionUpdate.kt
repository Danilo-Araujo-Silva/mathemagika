package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AllowVersionUpdate
 *
 * Full name:        System`AllowVersionUpdate
 *
 * Usage:            AllowVersionUpdate is an option for PacletInstall and PacletInstallSubmit that specifies whether a newer paclet version should be installed if an older version is already installed.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/AllowVersionUpdate
 * Documentation:    web: http://reference.wolfram.com/language/ref/AllowVersionUpdate.html
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
fun allowVersionUpdate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AllowVersionUpdate", arguments.toMutableList(), options)
}
