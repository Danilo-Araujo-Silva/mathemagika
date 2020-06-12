package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UpdatePacletSites
 *
 * Full name:        System`UpdatePacletSites
 *
 * Usage:            UpdatePacletSites is an option to PacletInstall and PacletInstallSubmit that specifies whether to first update the local cache of information about available paclets.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/UpdatePacletSites
 * Documentation:    web: http://reference.wolfram.com/language/ref/UpdatePacletSites.html
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
fun updatePacletSites(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UpdatePacletSites", arguments.toMutableList(), options)
}
