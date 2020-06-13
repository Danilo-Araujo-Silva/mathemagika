package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DMSString
 *
 * Full name:        System`DMSString
 *
 *                   DMSString[θ] converts an angle θ given in decimal degrees to a degrees-minutes-seconds string.
 *                   DMSString[{ϕ, λ}] converts latitude and longitude given in decimal degrees to a DMS latitude-longitude string.
 * Usage:            DMSString[{d, m, s}] converts a DMS list to a DMS string.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DMSString
 * Documentation:    web: http://reference.wolfram.com/language/ref/DMSString.html
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
fun dMSString(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DMSString", arguments.toMutableList(), options)
}
