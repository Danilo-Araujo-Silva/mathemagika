package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PacletSiteUnregister
 *
 * Full name:        System`PacletSiteUnregister
 *
 *                   PacletSiteUnregister[url] removes url from the list of registered paclet sites.
 *                   PacletSiteUnregister[name] removes the site named name from the list of registered paclet sites.
 * Usage:            PacletSiteUnregister[PacletSiteObject[…]] removes the given PacletSiteObject from the list of registered paclet sites.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PacletSiteUnregister
 * Documentation:    web: http://reference.wolfram.com/language/ref/PacletSiteUnregister.html
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
fun pacletSiteUnregister(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PacletSiteUnregister", arguments.toMutableList(), options)
}
