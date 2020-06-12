package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NetworkPacketRecording
 *
 * Full name:        System`NetworkPacketRecording
 *
 *                   NetworkPacketRecording[t] records information on network packets transmitted or received through all network interfaces on your computer for t seconds.
 *                   NetworkPacketRecording[t, service] records only packets associated with the specified network service.
 *                   NetworkPacketRecording[t, port] records only packets associated with the specified port.
 *                   NetworkPacketRecording[t, {port , port , …}] records only packets associated with any of the ports port .
 *                                                  1      2                                                                i
 * Usage:            NetworkPacketRecording[t, spec] records only packets matching the specification spec.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetworkPacketRecording
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetworkPacketRecording.html
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
fun networkPacketRecording(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetworkPacketRecording", arguments.toMutableList(), options)
}
