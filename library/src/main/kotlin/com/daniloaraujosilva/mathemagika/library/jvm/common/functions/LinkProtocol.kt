package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LinkProtocol
 *
 * Full name:        System`LinkProtocol
 *
 * Usage:            LinkProtocol is an option to LinkLaunch, Install, and related functions that specifies the underlying data transport protocol to use for a new WSTP link.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LinkProtocol
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinkProtocol.html
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
fun linkProtocol(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinkProtocol", arguments.toMutableList(), options)
}
