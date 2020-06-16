package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NetworkPacketRecordingDuring
 *
 * Full name:        System`NetworkPacketRecordingDuring
 *
 * Usage:            System`NetworkPacketRecordingDuring
 *
 * Options:          None
 *
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun networkPacketRecordingDuring(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetworkPacketRecordingDuring", arguments.toMutableList(), options)
}
