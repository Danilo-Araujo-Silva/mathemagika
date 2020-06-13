package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CloudDisconnect
 *
 * Full name:        System`CloudDisconnect
 *
 * Usage:            CloudDisconnect[] disconnects a non-cloud instance of the Wolfram Language from the Wolfram Cloud.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CloudDisconnect
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloudDisconnect.html
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
 * Default value:    Options[CloudDisconnect] = CloudObject`Private`sortOptions[{CloudBase :> $CloudBase}]
 *
 * Numeric values:   None
 */
fun cloudDisconnect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudDisconnect", arguments.toMutableList(), options)
}
