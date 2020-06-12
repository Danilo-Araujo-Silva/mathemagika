package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PacletSiteRegister
 *
 * Full name:        System`PacletSiteRegister
 *
 *                   PacletSiteRegister[url] registers url as a known paclet site.
 *                   PacletSiteRegister[url, name] registers url as a known paclet site with name.
 * Usage:            PacletSiteRegister[PacletSiteObject[…]] registers the given PacletSiteObject as a known paclet site.
 *
 * Options:          Prepend -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PacletSiteRegister
 * Documentation:    web: http://reference.wolfram.com/language/ref/PacletSiteRegister.html
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
fun pacletSiteRegister(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PacletSiteRegister", arguments.toMutableList(), options)
}
