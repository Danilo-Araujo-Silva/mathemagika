package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PacletSiteUpdate
 *
 * Full name:        System`PacletSiteUpdate
 *
 * Usage:            PacletSiteUpdate[site] acquires and caches current information about the available paclets on the given paclet site.
 *
 *                   Interactive -> False
 *                   Asynchronous -> False
 * Options:          Force -> True
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PacletSiteUpdate
 * Documentation:    web: http://reference.wolfram.com/language/ref/PacletSiteUpdate.html
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
fun pacletSiteUpdate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PacletSiteUpdate", arguments.toMutableList(), options)
}
