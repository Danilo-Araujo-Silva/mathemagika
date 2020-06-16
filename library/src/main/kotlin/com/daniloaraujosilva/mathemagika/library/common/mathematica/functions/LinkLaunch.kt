package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LinkLaunch
 *
 * Full name:        System`LinkLaunch
 *
 * Usage:            LinkLaunch["prog"] starts the external program prog and opens a WSTP connection to it.
 *
 *                   LinkHost ->
 *                   LinkMode -> Launch
 *                   LinkOptions -> 256
 * Options:          LinkProtocol -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LinkLaunch
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinkLaunch.html
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
fun linkLaunch(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinkLaunch", arguments.toMutableList(), options)
}
