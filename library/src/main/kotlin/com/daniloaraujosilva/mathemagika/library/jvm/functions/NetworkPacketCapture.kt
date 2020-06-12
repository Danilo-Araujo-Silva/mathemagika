package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NetworkPacketCapture
 *
 * Full name:        System`NetworkPacketCapture
 *
 *                   NetworkPacketCapture[] creates a temporary interactive interface for capturing information on network packets transmitted or received through all network interfaces on your computer.
 *                   NetworkPacketCapture[service] captures only packets associated with the specified network service.
 *                   NetworkPacketCapture[port] captures only packets associated with the specified port.
 * Usage:            NetworkPacketCapture[spec] captures only packets matching the specification spec.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetworkPacketCapture
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetworkPacketCapture.html
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
fun networkPacketCapture(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetworkPacketCapture", arguments.toMutableList(), options)
}
