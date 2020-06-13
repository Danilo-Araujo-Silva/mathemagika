package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Sockets
 *
 * Full name:        System`Sockets
 *
 *                   Sockets[] returns all active socket connections initiated by your current Wolfram Language session.
 *                   Sockets[All] returns all sockets connected to your current session, including remote sockets originating outside your current session.
 * Usage:            Sockets[spec] returns only sockets specified by spec.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Sockets
 * Documentation:    web: http://reference.wolfram.com/language/ref/Sockets.html
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
fun sockets(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Sockets", arguments.toMutableList(), options)
}
