package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Release
 *
 * Full name:        System`Release
 *
 * Usage:            System`Release
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Release
 * Documentation:    web: http://reference.wolfram.com/language/ref/Release.html
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
fun release(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Release", arguments.toMutableList(), options)
}
