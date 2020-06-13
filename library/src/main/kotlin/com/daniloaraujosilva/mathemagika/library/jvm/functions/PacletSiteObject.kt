package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PacletSiteObject
 *
 * Full name:        System`PacletSiteObject
 *
 * Usage:            PacletSiteObject[assoc] represents a site from which paclets can be automatically downloaded.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PacletSiteObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/PacletSiteObject.html
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
fun pacletSiteObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PacletSiteObject", arguments.toMutableList(), options)
}
