package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MachineID
 *
 * Full name:        System`MachineID
 *
 * Usage:            MachineID is an option to Encode which specifies the required value of $MachineID on the computer that reads the encoded file. If no value is specified, any value of $MachineID is allowed on the file-reading computer. A setting for MachineID must be a string.
 *
 * Options:          None
 *
 * Attributes:       Protected
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
fun machineID(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MachineID", arguments.toMutableList(), options)
}
