package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PacletNewerQ
 *
 * Full name:        System`PacletNewerQ
 *
 *                   PacletNewerQ[paclet , paclet ] returns True if paclet  has a higher version number than paclet , and False otherwise.
 * Usage:                               1        2                        1                                        2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PacletNewerQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/PacletNewerQ.html
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
fun pacletNewerQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PacletNewerQ", arguments.toMutableList(), options)
}
