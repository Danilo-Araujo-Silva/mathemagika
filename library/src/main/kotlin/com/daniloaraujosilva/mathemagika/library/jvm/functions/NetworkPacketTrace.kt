package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NetworkPacketTrace
 *
 * Full name:        System`NetworkPacketTrace
 *
 *                   NetworkPacketTrace[expr] evaluates expr and returns information on network packets transmitted or received through all network interfaces on your computer during the time of the evaluation, together with the result of the evaluation.
 *                   NetworkPacketTrace[expr, service] records only packets associated with the specified network service.
 *                   NetworkPacketTrace[expr, port] records only packets associated with the specified port.
 *                   NetworkPacketTrace[expr, {port , port , …}] records only packets associated with any of the ports port .
 *                                                 1      2                                                                i
 * Usage:            NetworkPacketTrace[expr, spec] records only packets matching the specification spec.
 *
 * Options:          None
 *
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetworkPacketTrace
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetworkPacketTrace.html
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
fun networkPacketTrace(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetworkPacketTrace", arguments.toMutableList(), options)
}
