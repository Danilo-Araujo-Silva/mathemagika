package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             IPAddress
 *
 * Full name:        System`IPAddress
 *
 * Usage:            IPAddress["address"] is a symbolic representation of an IPv4 or IPv6 IP address.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/IPAddress
 * Documentation:    web: http://reference.wolfram.com/language/ref/IPAddress.html
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
fun iPAddress(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IPAddress", arguments.toMutableList(), options)
}
