package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PacletSite
 *
 * Full name:        System`PacletSite
 *
 * Usage:            PacletSite is an option for PacletInstall and PacletInstallSubmit that specifies the URL of a paclet site on which to look for the paclet.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/PacletSite
 * Documentation:    web: http://reference.wolfram.com/language/ref/PacletSite.html
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
fun pacletSite(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PacletSite", arguments.toMutableList(), options)
}
